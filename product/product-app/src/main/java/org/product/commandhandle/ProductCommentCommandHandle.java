package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductCommentCommandHandle{
@CommandHandler
public void on (ProductCommentCommand Command){
AggregateLifecycle.apply(new ProductCommentEvent(Command.getProductCommentDto()));
}}
