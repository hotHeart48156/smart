package  org.product.commandhandle;
import lombok.Value;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.product.event.BrandStoryEvent;
import org.product.executor.command.aggre.BrandStoryCommand;

@Value
public class BrandStoryCommandHandle{
@CommandHandler
public void on (BrandStoryCommand Command){
AggregateLifecycle.apply(new BrandStoryEvent(Command.getBrandStoryDto()));
}}
