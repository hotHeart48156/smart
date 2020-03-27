package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductKeywordsDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductKeywordsCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductKeywordsService{
@Autowired
private CommandGateway commandGateway;
public void ProductKeywords(ProductKeywordsDto dto){
AbstractCommand command=new ProductKeywordsCommand(dto);
commandGateway.sendAndWait(command);
}
}