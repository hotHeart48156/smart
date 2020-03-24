package  org.product.commandhandle;

import lombok.Value;
import org.product.event.ProductSkuStockEvent;
import org.product.executor.command.entity.ProductSkuStockCommand;

@Value
public class ProductSkuStockCommandHandle{
@CommandHandler
public void on (ProductSkuStockCommand Command){
AggregateLifecycle.apply(new ProductSkuStockEvent(Command.getProductSkuStockDto()));
}}
