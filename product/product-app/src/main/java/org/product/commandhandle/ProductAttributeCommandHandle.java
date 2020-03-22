package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductAttributeCommandHandle{
@CommandHandler
public void on (ProductAttributeCommand Command){
AggregateLifecycle.apply(new ProductAttributeEvent(Command.getProductAttributeDto()));
}}
