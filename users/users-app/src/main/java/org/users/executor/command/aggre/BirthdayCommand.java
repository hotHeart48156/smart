package  org.users.executor.command.aggre;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class BirthdayCommand{
    @TargetAggregateIdentifier
private org.users.dto.agg.BirthdayDto BirthdayDto;
}
