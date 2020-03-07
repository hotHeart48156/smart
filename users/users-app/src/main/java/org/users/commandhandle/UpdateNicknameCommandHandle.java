package org.users.commandhandle;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.dto.domainevent.UpdateNicknameEvent;
import org.users.executor.command.UpdateNicknameCommand;

/**
 * @author yangbiao
 */

public class UpdateNicknameCommandHandle {
    @CommandHandler
    public void updateNickname(UpdateNicknameCommand updateNicknameCommand) {
        updateNicknameCommand.getNicknameDto().accept(this);
        AggregateLifecycle.apply(new UpdateNicknameEvent(updateNicknameCommand.getNicknameDto()));
    }


}
