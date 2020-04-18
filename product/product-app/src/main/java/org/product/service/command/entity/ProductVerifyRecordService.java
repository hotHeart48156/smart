package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductVerifyRecordDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductVerifyRecordCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductVerifyRecordService{
@Autowired
private CommandGateway commandGateway;
public void productVerifyRecord(ProductVerifyRecordDto dto){
AbstractCommand command=new ProductVerifyRecordCommand(dto);
commandGateway.sendAndWait(command);
}
}