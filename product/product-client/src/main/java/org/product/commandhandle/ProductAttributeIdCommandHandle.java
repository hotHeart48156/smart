package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductAttributeIdCommandHandle{
@CommandHandler
public void on (ProductAttributeIdCommand Command){
AggregateLifecycle.apply(new ProductAttributeIdEvent(Command.getProductAttributeIdDto()));
}}
