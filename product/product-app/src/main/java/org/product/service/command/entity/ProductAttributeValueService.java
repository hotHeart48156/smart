package  org.product.service.command.entity;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductAttributeValueDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductAttributeValueCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductAttributeValueService{
@Autowired
private CommandGateway commandGateway;
public void productAttributeValue(ProductAttributeValueDto dto){
AbstractCommand command=new ProductAttributeValueCommand(dto);
commandGateway.sendAndWait(command);
}
}