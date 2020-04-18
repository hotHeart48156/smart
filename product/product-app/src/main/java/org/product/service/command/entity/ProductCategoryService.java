package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductCategoryDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductCategoryService{
@Autowired
private CommandGateway commandGateway;
public void productCategory(ProductCategoryDto dto){
AbstractCommand command=new ProductCategoryCommand(dto);
commandGateway.sendAndWait(command);
}
}