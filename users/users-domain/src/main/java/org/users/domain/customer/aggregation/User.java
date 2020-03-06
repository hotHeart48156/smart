package org.users.domain.customer.aggregation;

import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.jetbrains.annotations.NotNull;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.icon.UserIcon;
import org.users.domain.customer.valueobject.id.*;
import org.users.domain.customer.valueobject.integration.Integration;
import org.users.domain.customer.valueobject.name.NickName;
import org.users.domain.customer.valueobject.name.UserName;
import org.users.domain.customer.valueobject.status.UserStatus;
import org.users.domain.customer.valueobject.type.SourceType;
import org.users.domain.customer.valueobject.user.Birthday;
import org.users.domain.customer.valueobject.user.Gender;
import org.users.domain.customer.valueobject.user.Job;
import org.users.domain.customer.valueobject.user.Password;

import java.util.List;
import java.util.Set;

/**
 * @author "yangbiao"
 */
@Data
@Aggregate

public class User implements Aggregation {
    @NotNull
    @TargetAggregateIdentifier
    private UserId userId;
    @NotNull
    private UserName userName;
    @NotNull
    @AggregateMember
    private List<MemberLevelId> memberLevelIds;
    @AggregateMember
    private List<Id> addressIds;
    @NotNull
    private Password password;
    @NotNull
    private NickName nickName;
    @NotNull
    private PhoneNumber phoneNumber;
    @NotNull
    private UserStatus userStatus;
    private UserIcon userIcon;
    @NotNull
    private Gender gender;
    @NotNull
    private Birthday birthday;
    private Job job;
    private SourceType sourceType;
    private Integration integration;
    private Growth growth;
    private WeixinOpenId weixinOpenId;
    @NotNull
    private CreateTime createTime;
    @AggregateMember
    private List<Id> growthChangeHistoryIds;
    private MemberLevelId memberLevelId;
    @AggregateMember
    private List<Id> integrationChangeHistoryIds;
    private Id memberStatisticsInfoId;
    @AggregateMember
    private List<Id> userCollectIds;
    private Set<RoleId> roleIds;



}
