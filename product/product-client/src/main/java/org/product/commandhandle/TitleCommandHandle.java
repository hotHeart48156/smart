package  org.product.commandhandle;
import lombok.Value;
@Value
public class TitleCommandHandle{
@CommandHandler
public void on (TitleCommand Command){
AggregateLifecycle.apply(new TitleEvent(Command.getTitleDto()));
}}
