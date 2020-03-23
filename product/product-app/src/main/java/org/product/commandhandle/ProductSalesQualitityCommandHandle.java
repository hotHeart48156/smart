package  org.product.commandhandle;

import lombok.Value;
import org.product.command.ProductSalesQualitityCommand;
import org.product.event.ProductSalesQualitityEvent;

@Value
public class ProductSalesQualitityCommandHandle{
@CommandHandler
public void on (ProductSalesQualitityCommand Command){
AggregateLifecycle.apply(new ProductSalesQualitityEvent(Command.getProductSalesQualitityDto()));
}}
