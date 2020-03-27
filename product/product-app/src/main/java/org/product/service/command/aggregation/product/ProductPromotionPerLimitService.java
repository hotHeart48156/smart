package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductPromotionPerLimitDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductPromotionPerLimitCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPromotionPerLimitService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionPerLimit(ProductPromotionPerLimitDto dto){
AbstractCommand command=new ProductPromotionPerLimitCommand(dto);
commandGateway.sendAndWait(command);
}
}