package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductSalesQualitityCommandHandle{
@CommandHandler
public void on (ProductSalesQualitityCommand Command){
AggregateLifecycle.apply(new ProductSalesQualitityEvent(Command.getProductSalesQualitityDto()));
}}
