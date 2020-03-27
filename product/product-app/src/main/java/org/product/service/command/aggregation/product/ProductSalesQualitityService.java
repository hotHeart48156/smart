package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductSalesQualitityDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductSalesQualitityCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductSalesQualitityService{
@Autowired
private CommandGateway commandGateway;
public void ProductSalesQualitity(ProductSalesQualitityDto dto){
AbstractCommand command=new ProductSalesQualitityCommand(dto);
commandGateway.sendAndWait(command);
}
}