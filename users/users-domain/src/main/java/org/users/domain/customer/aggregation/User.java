package org.users.domain.customer.aggregation;

import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.ValueObjectFactory;
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
import org.users.dto.domainevent.CreateUserEvent;
import org.users.dto.domainevent.UpdateUserEvent;
import org.users.executor.command.CreateUserCommand;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author "yangbiao"
 */
@Data

public class User {
    @NotNull
    @TargetAggregateIdentifier
    private UserId userId;
    @NotNull
    private UserName userName;
    @NotNull
    private List<MemberLevelId> memberLevelIds;
    private List<AddressId> addressIds;
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
    private List<Id> growthChangeHistoryIds;
    private MemberLevelId memberLevelId;
    private List<Id> integrationChangeHistoryIds;
    private Id memberStatisticsInfoId;
    private List<Id> userCollectIds;

    @CommandHandler
    public User(CreateUserCommand createUserCommand) {
        createUserCommand.getCreateUserDto().accept(this);
        AggregateLifecycle.apply(new CreateUserEvent(createUserCommand.getCreateUserDto()));
    }

    public User() {
    }

    @EventSourcingHandler
    public void on(UpdateUserEvent event) {
        event.getUserUpdateDto()
    }

    public static User update(UserUpdateDto userUpdateDto) {
        User user = new User();
        return null;
    }

    public void disable() {
        this.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class, UserStatus.ENABLE.getClass()));
    }

    public void enable() {
        this.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class, UserStatus.DISABLE.getClass()));

    }

    public static User changeMemberLevel() {
        return null;
    }

    public static Boolean checkUsernameAndPassword() {
        return null;
    }

    public static Boolean checkOpenid() {
        return null;
    }

}
