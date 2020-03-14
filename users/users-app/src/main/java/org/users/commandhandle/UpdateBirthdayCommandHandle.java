package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domainevent.UpdateBirthdayEvent;

/**
 * @author yangbiao
 */
@Component

public class UpdateBirthdayCommandHandle {
    private String id;
    @CommandHandler
    public void updateBirthday(UpdateBirthdayCommand updateBirthdayCommand) {
        AggregateLifecycle.apply(new UpdateBirthdayEvent(updateBirthdayCommand.getBirthdayDto()));
    }
}
