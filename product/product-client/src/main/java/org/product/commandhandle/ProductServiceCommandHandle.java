package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductServiceCommandHandle{
@CommandHandler
public void on (ProductServiceCommand Command){
AggregateLifecycle.apply(new ProductServiceEvent(Command.getProductServiceDto()));
}}
