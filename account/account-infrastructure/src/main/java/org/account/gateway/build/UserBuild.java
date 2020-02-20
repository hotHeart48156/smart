package org.account.gateway.build;

import org.account.domain.account.entity.User;
import org.account.domain.account.valueobj.user.*;
import org.account.entity.SysUserEntity;

import java.sql.Timestamp;

/**
 * @author "yangbiao"
 */
public class UserBuild implements org.account.domain.gateway.build.UserBuild {
    @Override
    public User toUser(Object userDo) {
        return null;
    }

    public User toUser(SysUserEntity sysUserEntity) {
        User user = new User();
        user.setId(UserObjectFactory.createUserObject(UserId.class, sysUserEntity.getId()));
        user.setCreateTime(UserObjectFactory.createUserObject(UserCreateTime.class, sysUserEntity.getCreateTime()));
        user.setEmail(UserObjectFactory.createUserObject(UserEmail.class, sysUserEntity.getEmail()));
        user.setLoginTime(UserObjectFactory.createUserObject(UserLoginTime.class, sysUserEntity.getLoginTime()));
        user.setPassword(UserObjectFactory.createUserObject(UserPassword.class, sysUserEntity.getPassword()));
        user.setRoleId(UserObjectFactory.createUserObject(UserRoleId.class, sysUserEntity.getSupplyId()));
        user.setStatus(UserObjectFactory.createUserObject(UserStatus.class, sysUserEntity.getStatus()));
        user.setUserNote(UserObjectFactory.createUserObject(UserNote.class, sysUserEntity.getNote()));
        user.setUserName(UserObjectFactory.createUserObject(UserName.class, sysUserEntity.getUsername()));


        return user;
    }

    @Override
    public SysUserEntity toUserEntity(User user) {
        SysUserEntity sysUserEntity = new SysUserEntity();
        sysUserEntity.setId(user.getId().getId());
        sysUserEntity.setCreateTime((Timestamp) user.getCreateTime().getCreateTime());
        sysUserEntity.setLoginTime((Timestamp) user.getLoginTime().getCreateTime());
        sysUserEntity.setEmail(user.getEmail().getEmail());
        sysUserEntity.setPassword(user.getPassword().getPassword());
        sysUserEntity.setNote(user.getUserNote().getNote());
        sysUserEntity.setStatus(user.getStatus().getStatus());
        sysUserEntity.setUsername(user.getUserName().getUserName());
        return sysUserEntity;
    }

}
