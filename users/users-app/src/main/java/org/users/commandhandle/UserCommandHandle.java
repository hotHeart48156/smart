package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domainevent.*;

/**
 * @author yangbiao
 */
@Component

public class UserCommandHandle {




    @CommandHandler
    public void changeAddress(UpdateAddressEvent addressEvent) {
        AggregateLifecycle.apply(addressEvent);

    }










}
