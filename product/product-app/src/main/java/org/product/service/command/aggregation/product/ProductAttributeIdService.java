package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductAttributeIdDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductAttributeIdCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductAttributeIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributeId(ProductAttributeIdDto dto){
AbstractCommand command=new ProductAttributeIdCommand(dto);
commandGateway.sendAndWait(command);
}
}