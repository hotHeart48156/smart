package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductDescriptionCommandHandle{
@CommandHandler
public void on (ProductDescriptionCommand Command){
AggregateLifecycle.apply(new ProductDescriptionEvent(Command.getProductDescriptionDto()));
}}
