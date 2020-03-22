package  org.product.commandhandle;
import lombok.Value;
@Value
public class BrandStoryCommandHandle{
@CommandHandler
public void on (BrandStoryCommand Command){
AggregateLifecycle.apply(new BrandStoryEvent(Command.getBrandStoryDto()));
}}
