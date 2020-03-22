package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductOriginalPriceCommandHandle{
@CommandHandler
public void on (ProductOriginalPriceCommand Command){
AggregateLifecycle.apply(new ProductOriginalPriceEvent(Command.getProductOriginalPriceDto()));
}}
