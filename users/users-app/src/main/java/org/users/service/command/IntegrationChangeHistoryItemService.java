package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.IntegrationChangeHistoryItemDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.IntegrationChangeHistoryItemCommand;

import org.springframework.stereotype.Service;
@Service
public class IntegrationChangeHistoryItemService{
@Autowired
private CommandGateway commandGateway;
public void IntegrationChangeHistoryItem(IntegrationChangeHistoryItemDto dto){
AbstractCommand command=new IntegrationChangeHistoryItemCommand(dto);
commandGateway.sendAndWait(command);
}
}