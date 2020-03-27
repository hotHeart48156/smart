package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductOperateLogDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductOperateLogCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductOperateLogService{
@Autowired
private CommandGateway commandGateway;
public void ProductOperateLog(ProductOperateLogDto dto){
AbstractCommand command=new ProductOperateLogCommand(dto);
commandGateway.sendAndWait(command);
}
}