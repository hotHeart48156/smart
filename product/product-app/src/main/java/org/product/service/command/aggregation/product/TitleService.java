package  org.product.service.command.aggregation.product;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.product.TitleDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.product.TitleCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TitleService{
@Autowired
private CommandGateway commandGateway;
public void Title(TitleDto dto){
AbstractCommand command=new TitleCommand(dto);
commandGateway.sendAndWait(command);
}
}