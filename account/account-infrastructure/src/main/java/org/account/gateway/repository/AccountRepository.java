package org.account.gateway.repository;

import org.account.domain.account.aggregate.Account;
import org.account.domain.account.entity.User;
import org.account.domain.account.valueobj.user.UserId;
import org.account.domain.account.valueobj.user.UserName;
import org.account.entity.SysPermissionEntity;
import org.account.entity.SysUserEntity;
import org.account.gateway.build.UserBuild;
import org.account.mapper.SysPermissionMapper;
import org.account.mapper.SysRoleMapper;
import org.account.mapper.SysSchoolMapper;
import org.account.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author "yangbiao"
 */
public class AccountRepository implements org.account.domain.gateway.repository.AccountRepository {

    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    SysPermissionMapper sysPermissionMapper;
    @Autowired
    SysRoleMapper sysRoleMapper;
    @Autowired
    SysSchoolMapper sysSchoolMapper;
    @Autowired
    org.account.domain.gateway.build.UserBuild userBuild = new UserBuild();

    @Override
    public Account getAccountByUserId(UserId userId) {
        Account account = new Account();
        SysUserEntity sysUserEntity = sysUserMapper.selectById(userId.getId());
        SysPermissionEntity sysPermissionEntity = sysPermissionMapper.selectById(userId.getId());
        account.setUser(userBuild.toUser(sysUserEntity));
        return account;
    }

    public Account getAccountByUserName(UserName userName) {
        Account account = new Account();
        SysUserEntity sysUserEntity = sysUserMapper.selectByUserName(userName.getUserName());
        account.setUser(userBuild.toUser(sysUserEntity));
        return account;

    }

    public void save(Account account) {
        sysUserMapper.insert((SysUserEntity) userBuild.toUserEntity(account.getUser()));

    }


}
