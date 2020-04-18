package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductAttributeCategoryDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductAttributeCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductAttributeCategoryService{
@Autowired
private CommandGateway commandGateway;
public void productAttributeCategory(ProductAttributeCategoryDto dto){
AbstractCommand command=new ProductAttributeCategoryCommand(dto);
commandGateway.sendAndWait(command);
}
}