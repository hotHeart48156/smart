package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductPromotionPerLimitService{
@Autowired
private CommandGateway commandGateway;
public void ProductPromotionPerLimit(ProductPromotionPerLimitDto dto){
AbstractCommand command=new ProductPromotionPerLimitCommand(dto);
commandGateway.sendAndWait(command);
}
}