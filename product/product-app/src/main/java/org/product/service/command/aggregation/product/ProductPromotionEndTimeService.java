package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductPromotionEndTimeDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductPromotionEndTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPromotionEndTimeService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionEndTime(ProductPromotionEndTimeDto dto){
AbstractCommand command=new ProductPromotionEndTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}