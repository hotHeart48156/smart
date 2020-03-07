package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.dto.domainevent.UpdateBirthdayEvent;
import org.users.executor.command.UpdateBirthdayCommand;

/**
 * @author yangbiao
 */

public class UpdateBirthdayCommandHandle {
    @CommandHandler
    public void updateBirthday(UpdateBirthdayCommand updateBirthdayCommand) {
        updateBirthdayCommand.getBirthdayDto().accept(this);
        AggregateLifecycle.apply(new UpdateBirthdayEvent(updateBirthdayCommand.getBirthdayDto()));
    }
}
