package org.users;

import org.axonframework.eventhandling.EventMessage;
import org.axonframework.eventhandling.GenericDomainEventMessage;
import org.users.domainevent.CreateUserEvent;

/**
 * @author "yangbiao"
 */

public class QueryProductMessage {
    EventMessage eventMessage = GenericDomainEventMessage.asEventMessage(new CreateUserEvent()).withMetaData()
}
