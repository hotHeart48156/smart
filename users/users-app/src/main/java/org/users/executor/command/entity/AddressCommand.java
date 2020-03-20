package  org.users.executor.command.entity;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddressCommand{
private org.users.dto.entity.AddressDto AddressDto;
}
