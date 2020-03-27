package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductPromotionPriceDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductPromotionPriceCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPromotionPriceService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionPrice(ProductPromotionPriceDto dto){
AbstractCommand command=new ProductPromotionPriceCommand(dto);
commandGateway.sendAndWait(command);
}
}