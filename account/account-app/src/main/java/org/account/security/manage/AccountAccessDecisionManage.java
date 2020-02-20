package org.account.security.manage;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author "yangbiao"
 * @create 2019122320:26
 */
@Service
public class AccountAccessDecisionManage implements AccessDecisionManage {
    @Override
    public AccessDecisionManager decide() {
        AccessDecisionManager manager = new AccessDecisionManager() {
            @Override
            public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
                if (null == collection || collection.size() <= 0) {
                    return;
                }
                ConfigAttribute c = null;
                String needRole = null;
                for (ConfigAttribute configAttribute : collection) {
                    c = configAttribute;
                    needRole = c.getAttribute();
                    for (GrantedAuthority ga : authentication.getAuthorities()) {//authentication 为在注释1 中循环添加到 GrantedAuthority 对象中的权限信息集合
                        if (needRole.trim().equals(ga.getAuthority().trim()) || needRole.trim().equals("ROLE_ANONYMOUS")) {
                            return;
                        }
                    }
                }
                throw new AccessDeniedException("no right");
            }

            @Override
            public boolean supports(ConfigAttribute configAttribute) {
                return false;
            }

            @Override
            public boolean supports(Class<?> aClass) {
                return false;
            }
        };
        return manager;
    }
}
