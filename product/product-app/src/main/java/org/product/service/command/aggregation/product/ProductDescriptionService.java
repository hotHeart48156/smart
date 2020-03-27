package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductDescriptionDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductDescriptionCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductDescriptionService{
@Autowired
private CommandGateway commandGateway;
public void ProductDescription(ProductDescriptionDto dto){
AbstractCommand command=new ProductDescriptionCommand(dto);
commandGateway.sendAndWait(command);
}
}