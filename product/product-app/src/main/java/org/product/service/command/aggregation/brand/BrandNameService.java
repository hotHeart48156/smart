package  org.product.service.command.aggregation.brand;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.brand.BrandNameDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.brand.BrandNameCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BrandNameService  extends AbstractBrandService{
@Autowired
private CommandGateway commandGateway;
public void brandName(BrandNameDto dto){
AbstractCommand command=new BrandNameCommand(dto);
commandGateway.sendAndWait(command);
}
}