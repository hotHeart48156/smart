package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductAttributeCategoryCommandHandle{
@CommandHandler
public void on (ProductAttributeCategoryCommand Command){
AggregateLifecycle.apply(new ProductAttributeCategoryEvent(Command.getProductAttributeCategoryDto()));
}}
