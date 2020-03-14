package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.springframework.stereotype.Component;
import org.users.domainevent.UpdateNicknameEvent;

/**
 * @author yangbiao
 */
@Component

public class UpdateNicknameCommandHandle {
    @CommandHandler
    public void updateNickname(UpdateNicknameCommand updateNicknameCommand) {
        AggregateLifecycle.apply(new UpdateNicknameEvent(updateNicknameCommand.getNicknameDto()));
    }


}
