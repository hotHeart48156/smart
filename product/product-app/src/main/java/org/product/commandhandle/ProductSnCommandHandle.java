package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductSnCommandHandle{
@CommandHandler
public void on (ProductSnCommand Command){
AggregateLifecycle.apply(new ProductSnEvent(Command.getProductSnDto()));
}}
