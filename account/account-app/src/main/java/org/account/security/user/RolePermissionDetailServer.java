package org.account.security.user;

import com.smart.website.mybatis.entity.UserEntity;
import com.smart.website.mybatis.respository.RoleRespository;
import com.smart.website.mybatis.respository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import java.io.Serializable;

/**
 * @author "yangbiao"
 * @create 201912230:52
 */
public class RolePermissionDetailServer implements PermissionEvaluator {
    @Autowired
    private UserRespository userRespository;
    @Autowired
    private RoleRespository roleRespository;

    @Override
    public boolean hasPermission(Authentication authentication, Object o, Object o1) {
        String username = authentication.getName();
        UserEntity userEntity = userRespository.findByUsername(username);
        return
        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }
}
