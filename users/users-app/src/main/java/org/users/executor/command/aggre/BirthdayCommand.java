package  org.users.executor.command.aggre;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import org.users.executor.AbstractCommand;
@Value
public class BirthdayCommand  extends AbstractCommand {
    @TargetAggregateIdentifier
private org.users.dto.agg.BirthdayDto BirthdayDto;
}
