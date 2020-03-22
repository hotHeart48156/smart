package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductPromotionPriceCommandHandle{
@CommandHandler
public void on (ProductPromotionPriceCommand Command){
AggregateLifecycle.apply(new ProductPromotionPriceEvent(Command.getProductPromotionPriceDto()));
}}
