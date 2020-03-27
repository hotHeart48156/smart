package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductStockDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductStockCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductStockService{
@Autowired
private CommandGateway commandGateway;
public void ProductStock(ProductStockDto dto){
AbstractCommand command=new ProductStockCommand(dto);
commandGateway.sendAndWait(command);
}
}