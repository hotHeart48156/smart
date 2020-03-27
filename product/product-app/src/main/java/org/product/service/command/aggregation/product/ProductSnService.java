package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductSnDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductSnCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductSnService{
@Autowired
private CommandGateway commandGateway;
public void ProductSn(ProductSnDto dto){
AbstractCommand command=new ProductSnCommand(dto);
commandGateway.sendAndWait(command);
}
}