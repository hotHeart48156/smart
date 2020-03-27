package  org.product.service.command.aggregation.product;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductPromotionStartTimeDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductPromotionStartTimeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPromotionStartTimeService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionStartTime(ProductPromotionStartTimeDto dto){
AbstractCommand command=new ProductPromotionStartTimeCommand(dto);
commandGateway.sendAndWait(command);
}
}