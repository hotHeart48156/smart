package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.FreightTemplateDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.FreightTemplateCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class FreightTemplateService{
@Autowired
private CommandGateway commandGateway;
public void freightTemplate(FreightTemplateDto dto){
AbstractCommand command=new FreightTemplateCommand(dto);
commandGateway.sendAndWait(command);
}
}