package org.users.dto.domainevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @author "yangbiao"
 */
public class CreateUserEvent extends AbstractEvent {
    /**
     * Create a new ContextStartedEvent.
     *
     * @param source the {@code ApplicationContext} that the event is raised for
     *               (must not be {@code null})
     */
    public CreateUserEvent(ApplicationContext source) {

    }
}
