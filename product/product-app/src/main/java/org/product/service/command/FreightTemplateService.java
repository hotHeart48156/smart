package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class FreightTemplateService{
@Autowired
private CommandGateway commandGateway;
public void FreightTemplate(FreightTemplateDto dto){
AbstractCommand command=new FreightTemplateCommand(dto);
commandGateway.sendAndWait(command);
}
}