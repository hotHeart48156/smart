package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.dto.domainevent.CreateUserEvent;
import org.users.executor.command.CreateUserCommand;

/**
 * @author yangbiao
 */

public class UserCommandHandle {
    @CommandHandler
    public UserCommandHandle(CreateUserCommand createUserCommand) {
        AggregateLifecycle.apply(new CreateUserEvent(createUserCommand));
        createUserCommand.
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
