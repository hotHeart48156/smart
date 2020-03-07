package org.users.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;
import org.users.domain.aggregation.User;
import org.users.domain.repository.UserRepository;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.UserName;
import org.users.security.encode.Encode;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 * @author "yangbiao"
 * @create 2019122317:57
 */
public class UserDetailService implements DetailService {
    @Autowired
    Encode encode;
    @Autowired
    UserRepository repository;

    @Override
    public UserDetailsService detailsService() {
        UserDetailsService service = new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
                if (StringUtils.isEmpty(s)) {
                    throw new UsernameNotFoundException("user not find");
                }
                User userEntity = repository.findById(ValueObjectFactory.newInstance(UserName.class, s.getClass())).get();
                Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();

                return new UserDetails() {
                    @Override
                    public Collection<? extends GrantedAuthority> getAuthorities() {
                        return authorities;
                    }

                    @Override
                    public String getPassword() {
                        return encode.encoder().encode(userEntity.getPassword().getPassword());
                    }

                    @Override
                    public String getUsername() {
                        return userEntity.getUserName().getName();
                    }

                    @Override
                    public boolean isAccountNonExpired() {
                        return true;
                    }

                    @Override
                    public boolean isAccountNonLocked() {
                        return true;
                    }

                    @Override
                    public boolean isCredentialsNonExpired() {
                        return true;
                    }

                    @Override
                    public boolean isEnabled() {
                        return true;
                    }
                };
            }
        };
        return service;
    }
}
