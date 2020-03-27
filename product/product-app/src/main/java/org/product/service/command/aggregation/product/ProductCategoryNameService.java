package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductCategoryNameDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductCategoryNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductCategoryNameService{
@Autowired
private CommandGateway commandGateway;
public void ProductCategoryName(ProductCategoryNameDto dto){
AbstractCommand command=new ProductCategoryNameCommand(dto);
commandGateway.sendAndWait(command);
}
}