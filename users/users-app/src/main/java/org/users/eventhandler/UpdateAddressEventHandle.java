package org.users.eventhandler;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.users.domain.customer.repository.AddressRepository;
import org.users.domain.customer.repository.UserRepository;
import org.users.dto.domainevent.UpdateAddressEvent;

/**
 * @author "yangbiao"
 */
@Slf4j
@Component
@ProcessingGroup("user")
public class UpdateAddressEventHandle extends AbstractEventHandle {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private UserRepository userRepository;

    @EventHandler
    public void on(UpdateAddressEvent event) {

    }
}
