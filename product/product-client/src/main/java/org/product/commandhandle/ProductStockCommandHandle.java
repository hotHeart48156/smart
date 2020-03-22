package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductStockCommandHandle{
@CommandHandler
public void on (ProductStockCommand Command){
AggregateLifecycle.apply(new ProductStockEvent(Command.getProductStockDto()));
}}
