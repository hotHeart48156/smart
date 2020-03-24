package  org.product.commandhandle;

import lombok.Value;
import org.product.event.GiftsCategoryEvent;
import org.product.executor.command.entity.GiftsCategoryCommand;

@Value
public class GiftsCategoryCommandHandle{
@CommandHandler
public void on (GiftsCategoryCommand Command){
AggregateLifecycle.apply(new GiftsCategoryEvent(Command.getGiftsCategoryDto()));
}}
