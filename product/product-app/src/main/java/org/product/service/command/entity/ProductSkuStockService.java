package  org.product.service.command.entity;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.product.dto.entity.ProductSkuStockDto;
import org.product.executor.AbstractCommand;
import org.product.executor.command.entity.ProductSkuStockCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ProductSkuStockService{
@Autowired
private CommandGateway commandGateway;
public void productSkuStock(ProductSkuStockDto dto){
AbstractCommand command=new ProductSkuStockCommand(dto);
commandGateway.sendAndWait(command);
}
}