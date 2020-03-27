package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductTypeDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductTypeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductTypeService{
@Autowired
private CommandGateway commandGateway;
public void ProductType(ProductTypeDto dto){
AbstractCommand command=new ProductTypeCommand(dto);
commandGateway.sendAndWait(command);
}
}