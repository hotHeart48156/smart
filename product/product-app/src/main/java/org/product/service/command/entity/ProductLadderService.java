package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductLadderDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductLadderCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductLadderService{
@Autowired
private CommandGateway commandGateway;
public void ProductLadder(ProductLadderDto dto){
AbstractCommand command=new ProductLadderCommand(dto);
commandGateway.sendAndWait(command);
}
}