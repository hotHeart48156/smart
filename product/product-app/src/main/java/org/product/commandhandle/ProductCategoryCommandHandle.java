package  org.product.commandhandle;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.event.ProductCategoryEvent;
import org.product.executor.command.entity.ProductCategoryCommand;

@Value
public class ProductCategoryCommandHandle{
@CommandHandler
public void on (ProductCategoryCommand Command){
AggregateLifecycle.apply(new ProductCategoryEvent(Command.getProductCategoryDto()));
}}
