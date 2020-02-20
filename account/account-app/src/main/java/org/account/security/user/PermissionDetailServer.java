package org.account.security.user;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author "yangbiao"
 * @create 201912230:51
 */
public class PermissionDetailServer implements DetailService {
    @Override
    public UserDetailsService detailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
                return null;
            }
        };
    }
}
