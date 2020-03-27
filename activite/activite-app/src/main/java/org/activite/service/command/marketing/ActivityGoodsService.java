package  org.activite.service.command.marketing;

import org.activite.dto.agg.marketing.ActivityGoodsDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.marketing.ActivityGoodsCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class ActivityGoodsService{
@Autowired
private CommandGateway commandGateway;
public void ActivityGoods(ActivityGoodsDto dto){
AbstractCommand command=new ActivityGoodsCommand(dto);
commandGateway.sendAndWait(command);
}
}