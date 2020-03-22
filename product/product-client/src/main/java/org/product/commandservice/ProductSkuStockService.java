package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class ProductSkuStockService{
@Autowired
private CommandGateway commandGateway;
public void ProductSkuStock(ProductSkuStockDto dto){
AbstractCommand command=new ProductSkuStockCommand(dto);
commandGateway.sendAndWait(command);
}
}