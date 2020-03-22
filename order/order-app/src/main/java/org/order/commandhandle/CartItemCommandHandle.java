package  org.order.commandhandle;
import lombok.Value;
@Value
public class CartItemCommandHandle{
@CommandHandler
public void on (CartItemCommand Command){
AggregateLifecycle.apply(new CartItemEvent(Command.getCartItemDto()));
}}
