package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductLogoDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductLogoCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductLogoService{
@Autowired
private CommandGateway commandGateway;
public void ProductLogo(ProductLogoDto dto){
AbstractCommand command=new ProductLogoCommand(dto);
commandGateway.sendAndWait(command);
}
}