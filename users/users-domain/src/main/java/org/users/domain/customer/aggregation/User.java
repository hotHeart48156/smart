package org.users.domain.customer.aggregation;

import lombok.Data;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
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
import org.users.dto.AbstractDto;
import org.users.dto.domainevent.*;
import org.users.executor.AbstractCommand;
import org.users.executor.command.*;

import javax.validation.constraints.NotNull;
import java.util.List;

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

    @CommandHandler
    public User(CreateUserCommand createUserCommand) {
        createUserCommand.getCreateUserDto().accept(this);
        AggregateLifecycle.apply(new CreateUserEvent(createUserCommand.getCreateUserDto()));
    }

    public User() {
    }


    @CommandHandler
    public void changeMemberLevel() {

    }

    @CommandHandler
    public void changeAddress(UpdateAddressEvent addressEvent) {
        AggregateLifecycle.apply(addressEvent);
    }

    public void updatePassword(UpdatePasswordCommand updatePasswordCommand) {
        updatePasswordCommand.getPasswordDto().accept(this);
        AggregateLifecycle.apply(new UpdatePasswordEvent(updatePasswordCommand.getPasswordDto()));
    }

    @CommandHandler
    public void updateNickname(UpdateNicknameCommand updateNicknameCommand) {
        updateNicknameCommand.getNicknameDto().accept(this);
        AggregateLifecycle.apply(new UpdateNicknameEvent(updateNicknameCommand.getNicknameDto()));
    }

    @CommandHandler
    public void updatePhone(UpdatePhoneCommand updatePhoneCommand) {
        updatePhoneCommand.getPhoneDto().accept(this);
        AggregateLifecycle.apply(new UpdatePhoneCommand(updatePhoneCommand.getPhoneDto()));
    }

    @CommandHandler
    public void updateBirthday(UpdateBirthdayCommand updateBirthdayCommand) {
        updateBirthdayCommand.getBirthdayDto().accept(this);
        AggregateLifecycle.apply(new UpdateBirthdayEvent(updateBirthdayCommand.getBirthdayDto()));
    }

    @CommandHandler
    public void updateJob(UpdateJobCommand updateJobCommand) {
        updateJobCommand.getJobDto().accept(this);
        AggregateLifecycle.apply(new UpdateJobEvent(updateJobCommand.getJobDto()));
    }

    @CommandHandler
    public void integration(UpdateIntegrationCommand updateIntegrationCommand) {
        updateIntegrationCommand.getIntegrationDto().accept(this);
        AggregateLifecycle.apply(new UpdateIntegrationEvent(updateIntegrationCommand.getIntegrationDto()));
    }

    @CommandHandler
    public void growth(UpdateGrowthCommand updateGrowthCommand) {
        updateGrowthCommand.getGrowthDto().accept(this);
        AggregateLifecycle.apply(new UpdateGrowthEvent(updateGrowthCommand.getGrowthDto()));
    }

    @CommandHandler
    public void update(AbstractDto dto, AbstractCommand command, UserId userId) {
    }

}
