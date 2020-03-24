package org.product.service.command;

import org.activite.executor.command.AbstractCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.brand.BrandNameDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.BrandNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
public class BrandNameService{
@Autowired
private CommandGateway commandGateway;
public void BrandName(BrandNameDto dto){
AbstractCommand command=new BrandNameCommand(dto);
commandGateway.sendAndWait(command);
}
}