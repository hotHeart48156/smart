package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domain.valueobject.id.UserId;
import org.users.dto.domainevent.*;
import org.users.executor.command.*;

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
