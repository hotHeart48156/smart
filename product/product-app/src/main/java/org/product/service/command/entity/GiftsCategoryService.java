package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.GiftsCategoryDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.GiftsCategoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class GiftsCategoryService{
@Autowired
private CommandGateway commandGateway;
public void GiftsCategory(GiftsCategoryDto dto){
AbstractCommand command=new GiftsCategoryCommand(dto);
commandGateway.sendAndWait(command);
}
}