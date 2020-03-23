package  org.product.commandhandle;

import lombok.Value;
import org.product.command.GiftsCategoryCommand;
import org.product.event.GiftsCategoryEvent;

@Value
public class GiftsCategoryCommandHandle{
@CommandHandler
public void on (GiftsCategoryCommand Command){
AggregateLifecycle.apply(new GiftsCategoryEvent(Command.getGiftsCategoryDto()));
}}
