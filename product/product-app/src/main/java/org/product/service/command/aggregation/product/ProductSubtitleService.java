package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductSubtitleDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductSubtitleCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductSubtitleService{
@Autowired
private CommandGateway commandGateway;
public void ProductSubtitle(ProductSubtitleDto dto){
AbstractCommand command=new ProductSubtitleCommand(dto);
commandGateway.sendAndWait(command);
}
}