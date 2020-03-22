package  org.product.commandhandle;
import lombok.Value;
@Value
public class PreviewStatusCommandHandle{
@CommandHandler
public void on (PreviewStatusCommand Command){
AggregateLifecycle.apply(new PreviewStatusEvent(Command.getPreviewStatusDto()));
}}
