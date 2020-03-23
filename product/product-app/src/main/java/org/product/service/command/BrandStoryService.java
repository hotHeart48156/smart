package org.product.service.command;

import org.activite.executor.command.AbstractCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.executor.command.BrandStoryCommand;
import org.product.dto.aggre.brand.BrandStoryDto;
import org.springframework.beans.factory.annotation.Autowired;
public class BrandStoryService{
@Autowired
private CommandGateway commandGateway;
public void BrandStory(BrandStoryDto dto){
AbstractCommand command=new BrandStoryCommand(dto);
commandGateway.sendAndWait(command);
}
}