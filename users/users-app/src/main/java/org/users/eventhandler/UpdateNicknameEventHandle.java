package org.users.eventhandler;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.domain.repository.UserRepository;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
@ProcessingGroup("user")
public class UpdateNicknameEventHandle extends AbstractEventHandle {
    @Autowired
    private UserRepository repository;

    @EventHandler
    public void on() {
    }


}
