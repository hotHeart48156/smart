package  org.product.commandhandle;
import lombok.Value;
@Value
public class ProductNoteCommandHandle{
@CommandHandler
public void on (ProductNoteCommand Command){
AggregateLifecycle.apply(new ProductNoteEvent(Command.getProductNoteDto()));
}}
