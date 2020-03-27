package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductPriceDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPriceService{
@Autowired
private CommandGateway commandGateway;
public void ProductPrice(ProductPriceDto dto){
AbstractCommand command=new ProductPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}