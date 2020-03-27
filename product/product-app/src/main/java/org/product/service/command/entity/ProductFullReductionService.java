package  org.product.service.command.entity;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductFullReductionDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductFullReductionCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductFullReductionService{
@Autowired
private CommandGateway commandGateway;
public void ProductFullReduction(ProductFullReductionDto dto){
AbstractCommand command=new ProductFullReductionCommand(dto);
commandGateway.sendAndWait(command);
}
}