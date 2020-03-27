package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.ProductNoteDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.ProductNoteCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductNoteService{
@Autowired
private CommandGateway commandGateway;
public void ProductNote(ProductNoteDto dto){
AbstractCommand command=new ProductNoteCommand(dto);
commandGateway.sendAndWait(command);
}
}