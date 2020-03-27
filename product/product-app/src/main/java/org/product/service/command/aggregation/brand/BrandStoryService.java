package  org.product.service.command.aggregation.brand;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.aggre.brand.BrandStoryDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.aggre.brand.BrandStoryCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BrandStoryService  extends AbstractBrandService{
@Autowired
private CommandGateway commandGateway;
public void BrandStory(BrandStoryDto dto){
AbstractCommand command=new BrandStoryCommand(dto);
commandGateway.sendAndWait(command);
}
}