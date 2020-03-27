package  org.activite.service.command.coupon;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class ProductAttributesService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttributes(ProductAttributesDto dto){
AbstractCommand command=new ProductAttributesCommand(dto);
commandGateway.sendAndWait(command);
}
}