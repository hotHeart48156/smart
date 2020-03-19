package  org.activite.service.command;

import org.activite.dto.agg.ActivityGoodsDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.ActivityGoodsCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;
@Component
public class ActivityGoodsService  extends AbstractService{
@Autowired
private CommandGateway commandGateway;
public void ActivityGoods(ActivityGoodsDto dto){
AbstractCommand command=new ActivityGoodsCommand(dto);
commandGateway.sendAndWait(command);
}
}