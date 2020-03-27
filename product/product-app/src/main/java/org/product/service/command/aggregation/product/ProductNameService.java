package  org.product.service.command.aggregation.product;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductNameDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductNameService{
@Autowired
private CommandGateway commandGateway;
public void ProductName(ProductNameDto dto){
AbstractCommand command=new ProductNameCommand(dto);
commandGateway.sendAndWait(command);
}
}