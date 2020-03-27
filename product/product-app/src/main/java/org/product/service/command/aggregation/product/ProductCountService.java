package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductCountDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductCountCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductCountService{
@Autowired
private CommandGateway commandGateway;
public void ProductCount(ProductCountDto dto){
AbstractCommand command=new ProductCountCommand(dto);
commandGateway.sendAndWait(command);
}
}