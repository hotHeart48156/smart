package org.activite.commandhandle;
import org.springframework.stereotype.Component;
@Component
public class PromotionCommandHandle   extends AbstractCommandHandle {import org.axonframework.commandhandling.CommandHandler;
import org.activite.event.*;
import org.activite.executor.command.*;
}