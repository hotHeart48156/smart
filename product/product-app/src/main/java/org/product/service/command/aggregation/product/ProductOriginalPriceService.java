package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductOriginalPriceDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductOriginalPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductOriginalPriceService{
@Autowired
private CommandGateway commandGateway;
public void ProductOriginalPrice(ProductOriginalPriceDto dto){
AbstractCommand command=new ProductOriginalPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}