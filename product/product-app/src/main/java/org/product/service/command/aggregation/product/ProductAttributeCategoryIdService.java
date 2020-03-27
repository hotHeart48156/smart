package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductAttributeCategoryIdDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductAttributeCategoryIdCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductAttributeCategoryIdService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributeCategoryId(ProductAttributeCategoryIdDto dto){
AbstractCommand command=new ProductAttributeCategoryIdCommand(dto);
commandGateway.sendAndWait(command);
}
}