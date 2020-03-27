package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductPicDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductPicCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductPicService{
@Autowired
private CommandGateway commandGateway;
public void ProductPic(ProductPicDto dto){
AbstractCommand command=new ProductPicCommand(dto);
commandGateway.sendAndWait(command);
}
}