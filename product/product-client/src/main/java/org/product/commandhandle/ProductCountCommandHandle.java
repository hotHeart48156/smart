package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductCountCommandHandle{
@CommandHandler
public void on (ProductCountCommand Command){
AggregateLifecycle.apply(new ProductCountEvent(Command.getProductCountDto()));
}}
