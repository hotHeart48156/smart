package org.users.eventhandler;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.domain.customer.repository.UserRepository;
import org.users.dto.BirthdayDto;
import org.users.dto.domainevent.UpdateBirthdayEvent;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
@ProcessingGroup("user")
public class UpdateBirthdayEventHandle extends AbstractEventHandle {
    @Autowired
    private UserRepository userRepository;

    @EventHandler
    public void on(UpdateBirthdayEvent event) {

    }
}
