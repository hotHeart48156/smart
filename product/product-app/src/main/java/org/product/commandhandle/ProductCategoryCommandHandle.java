package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductCategoryCommandHandle{
@CommandHandler
public void on (ProductCategoryCommand Command){
AggregateLifecycle.apply(new ProductCategoryEvent(Command.getProductCategoryDto()));
}}
