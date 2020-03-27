package  org.product.service.command.aggregation.brand;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.brand.LetterDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.brand.LetterCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LetterService  extends AbstractBrandService{
@Autowired
private CommandGateway commandGateway;
public void Letter(LetterDto dto){
AbstractCommand command=new LetterCommand(dto);
commandGateway.sendAndWait(command);
}
}