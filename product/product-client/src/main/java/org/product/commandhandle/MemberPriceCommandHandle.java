package  org.product.commandhandle;
import lombok.Value;
@Value
public class MemberPriceCommandHandle{
@CommandHandler
public void on (MemberPriceCommand Command){
AggregateLifecycle.apply(new MemberPriceEvent(Command.getMemberPriceDto()));
}}
