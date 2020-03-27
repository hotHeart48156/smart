package  org.product.service.command.entity;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductAttributeDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductAttributeCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductAttributeService{
@Autowired
private CommandGateway commandGateway;
public void ProductAttribute(ProductAttributeDto dto){
AbstractCommand command=new ProductAttributeCommand(dto);
commandGateway.sendAndWait(command);
}
}