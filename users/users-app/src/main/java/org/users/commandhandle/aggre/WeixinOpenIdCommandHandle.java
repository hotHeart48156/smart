package  org.users.commandhandle.aggre;

import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.users.domainevent.aggevent.WeixinOpenIdEvent;
import org.users.executor.command.aggre.WeixinOpenIdCommand;

@Value
public class WeixinOpenIdCommandHandle{
@CommandHandler
public void on (WeixinOpenIdCommand Command){
AggregateLifecycle.apply(new WeixinOpenIdEvent(Command.getWeixinOpenIdDto()));
}}
