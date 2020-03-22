package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductTypeCommandHandle{
@CommandHandler
public void on (ProductTypeCommand Command){
AggregateLifecycle.apply(new ProductTypeEvent(Command.getProductTypeDto()));
}}
