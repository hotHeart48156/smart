package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductAttributeValueCommandHandle{
@CommandHandler
public void on (ProductAttributeValueCommand Command){
AggregateLifecycle.apply(new ProductAttributeValueEvent(Command.getProductAttributeValueDto()));
}}
