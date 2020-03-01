package org.users.eventhandler;

import org.axonframework.eventhandling.EventHandler;
import org.users.dto.domainevent.UpdateGrowthEvent;

/**
 * @author "yangbiao"
 */
public class UpdateGrowthEventHandle {
    @EventHandler
    public void handle(UpdateGrowthEvent updateGrowthEvent) {

    }
}
