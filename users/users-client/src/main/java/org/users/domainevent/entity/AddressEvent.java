package  org.users.domainevent.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class AddressEvent{
private org.users.dto.entity.AddressDto AddressDto;
}
