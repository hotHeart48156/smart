package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductLadderCommandHandle{
@CommandHandler
public void on (ProductLadderCommand Command){
AggregateLifecycle.apply(new ProductLadderEvent(Command.getProductLadderDto()));
}}
