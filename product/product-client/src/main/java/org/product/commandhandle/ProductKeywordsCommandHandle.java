package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductKeywordsCommandHandle{
@CommandHandler
public void on (ProductKeywordsCommand Command){
AggregateLifecycle.apply(new ProductKeywordsEvent(Command.getProductKeywordsDto()));
}}
