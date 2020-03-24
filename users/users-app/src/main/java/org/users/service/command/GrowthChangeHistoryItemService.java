package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.GrowthChangeHistoryItemDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.GrowthChangeHistoryItemCommand;

import org.springframework.stereotype.Service;
@Service
public class GrowthChangeHistoryItemService{
@Autowired
private CommandGateway commandGateway;
public void GrowthChangeHistoryItem(GrowthChangeHistoryItemDto dto){
AbstractCommand command=new GrowthChangeHistoryItemCommand(dto);
commandGateway.sendAndWait(command);
}
}