package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductPromotionStartTimeCommandHandle{
@CommandHandler
public void on (ProductPromotionStartTimeCommand Command){
AggregateLifecycle.apply(new ProductPromotionStartTimeEvent(Command.getProductPromotionStartTimeDto()));
}}
