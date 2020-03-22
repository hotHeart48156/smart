package  org.users.executor.command.entity;
import lombok.AllArgsConstructor;
import lombok.Value;

import org.users.executor.AbstractCommand;
@Value
@AllArgsConstructor
public class AddressCommand  extends AbstractCommand {
private org.users.dto.entity.AddressDto AddressDto;
}
