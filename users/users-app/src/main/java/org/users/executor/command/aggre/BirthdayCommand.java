package  org.users.executor.command.aggre;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;
import org.users.executor.AbstractCommand;
@Value
@EqualsAndHashCode(callSuper = false)

public class BirthdayCommand  extends AbstractCommand {
    @TargetAggregateIdentifier
private org.users.dto.agg.BirthdayDto BirthdayDto;
}
