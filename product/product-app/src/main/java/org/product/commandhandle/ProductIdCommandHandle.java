package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductIdCommandHandle{
@CommandHandler
public void on (ProductIdCommand Command){
AggregateLifecycle.apply(new ProductIdEvent(Command.getProductIdDto()));
}}
