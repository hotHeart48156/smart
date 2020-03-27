package  org.product.service.command.entity;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.GiftsDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.GiftsCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class GiftsService{
@Autowired
private CommandGateway commandGateway;
public void Gifts(GiftsDto dto){
AbstractCommand command=new GiftsCommand(dto);
commandGateway.sendAndWait(command);
}
}