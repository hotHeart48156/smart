package  org.activite.service.command.promotion;

import org.activite.dto.agg.promotion.TitleDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.promotion.TitleCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class TitleService{
@Autowired
private CommandGateway commandGateway;
public void Title(TitleDto dto){
AbstractCommand command=new TitleCommand(dto);
commandGateway.sendAndWait(command);
}
}