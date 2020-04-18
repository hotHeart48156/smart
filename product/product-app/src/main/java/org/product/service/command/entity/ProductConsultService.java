package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductConsultDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductConsultCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductConsultService{
@Autowired
private CommandGateway commandGateway;
public void productConsult(ProductConsultDto dto){
AbstractCommand command=new ProductConsultCommand(dto);
commandGateway.sendAndWait(command);
}
}