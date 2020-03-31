package  org.activite.service.command.coupon;

import org.activite.dto.agg.coupon.ProductAttributesDto;
import org.activite.executor.AbstractCommand;
import org.activite.executor.command.aggregation.coupon.ProductAttributesCommand;
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