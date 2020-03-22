package org.product.service.command;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductOperateLogService{
@Autowired
private CommandGateway commandGateway;
public void ProductOperateLog(ProductOperateLogDto dto){
AbstractCommand command=new ProductOperateLogCommand(dto);
commandGateway.sendAndWait(command);
}
}