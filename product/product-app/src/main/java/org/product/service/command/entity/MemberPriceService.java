package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.MemberPriceDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.MemberPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class MemberPriceService{
@Autowired
private CommandGateway commandGateway;
public void memberPrice(MemberPriceDto dto){
AbstractCommand command=new MemberPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}