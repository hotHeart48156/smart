package  org.order.commandhandle;
import lombok.Value;
@Value
public class CompanyAddressCommandHandle{
@CommandHandler
public void on (CompanyAddressCommand Command){
AggregateLifecycle.apply(new CompanyAddressEvent(Command.getCompanyAddressDto()));
}}
