package org.account.security.user;

import com.smart.website.persistence.mybatis.service.Service;
import com.smart.website.security.spring.encode.Encode;
import org.account.entity.SysUserEntity;
import org.account.entity.SysUserVo;
import org.account.mapper.SysAlipayConfigMapper;
import org.account.mapper.SysRoleMapper;
import org.account.mapper.SysUserMapper;
import org.account.security.encode.Encode;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.StringUtils;

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
    SysUserMapper userRepository;
    @Autowired
    SysRoleMapper roleMapper;

    @Override
    public UserDetailsService detailsService() {
        UserDetailsService service = new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

                if (StringUtils.isEmpty(s)) {
                    throw new UsernameNotFoundException("user not find");
                }
                SysUserVo userEntity = userRepository.selectByUserName(s);

                Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
                for (Object id : roleMapper.selectById(userEntity.getId())) {
                    authorities.add(new SimpleGrantedAuthority(id.toString()));


                }
                userRepository.
                return new UserDetails() {
                    @Override
                    public Collection<? extends GrantedAuthority> getAuthorities() {
                        return authorities;
                    }

                    @Override
                    public String getPassword() {
                        return encode.encoder().encode(userEntity.getPassword());
                    }

                    @Override
                    public String getUsername() {
                        return userEntity.getUsername();
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
