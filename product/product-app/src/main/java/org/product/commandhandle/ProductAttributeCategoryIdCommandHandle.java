package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductAttributeCategoryIdCommandHandle{
@CommandHandler
public void on (ProductAttributeCategoryIdCommand Command){
AggregateLifecycle.apply(new ProductAttributeCategoryIdEvent(Command.getProductAttributeCategoryIdDto()));
}}
