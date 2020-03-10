package org.users.commandhandle;

import net.oschina.j2cache.CacheChannel;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.domainevent.UpdateBirthdayEvent;
import org.users.executor.command.UpdateBirthdayCommand;

/**
 * @author yangbiao
 */

public class UpdateBirthdayCommandHandle {
    @CommandHandler
    public void updateBirthday(UpdateBirthdayCommand updateBirthdayCommand) {
        AggregateLifecycle.apply(new UpdateBirthdayEvent(updateBirthdayCommand.getBirthdayDto()));
    }
}
