package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class MemberPriceService{
@Autowired
private CommandGateway commandGateway;
public void MemberPrice(MemberPriceDto dto){
AbstractCommand command=new MemberPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}