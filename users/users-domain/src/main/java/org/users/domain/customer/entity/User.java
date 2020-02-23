package org.users.domain.customer.entity;

import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.icon.UserIcon;
import org.users.domain.customer.valueobject.id.AreaId;
import org.users.domain.customer.valueobject.id.MemberLevelId;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.id.WeixinOpenId;
import org.users.domain.customer.valueobject.integration.Integration;
import org.users.domain.customer.valueobject.name.AreaName;
import org.users.domain.customer.valueobject.name.NickName;
import org.users.domain.customer.valueobject.name.UserName;
import org.users.domain.customer.valueobject.status.UserStatus;
import org.users.domain.customer.valueobject.type.SourceType;
import org.users.domain.customer.valueobject.user.Brithday;
import org.users.domain.customer.valueobject.user.Gender;
import org.users.domain.customer.valueobject.user.Job;
import org.users.domain.customer.valueobject.user.Password;

/**
 * @author "yangbiao"
 */
public class User {
    private UserId userId;
    private UserName userName;
    private MemberLevelId memberLevelId;
    private AreaId areaId;
    private AreaName areaName;
    private Password password;
    private NickName nickName;
    private PhoneNumber phoneNumber;
    private UserStatus userStatus;
    private UserIcon userIcon;
    private Gender gender;
    private Brithday brithday;
    private Address address;
    private Job job;
    private SourceType sourceType;
    private Integration integration;
    private Growth growth;
    private WeixinOpenId weixinOpenId;
    private CreateTime createTime;

}
