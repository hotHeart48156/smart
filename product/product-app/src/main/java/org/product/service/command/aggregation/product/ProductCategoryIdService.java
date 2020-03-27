package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductCategoryIdDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductCategoryIdCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductCategoryIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductCategoryId(ProductCategoryIdDto dto){
AbstractCommand command=new ProductCategoryIdCommand(dto);
commandGateway.sendAndWait(command);
}
}