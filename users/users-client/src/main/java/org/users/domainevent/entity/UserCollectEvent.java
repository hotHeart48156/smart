package  org.users.domainevent.entity;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserCollectEvent{
private org.users.dto.entity.UserCollectDto UserCollectDto;
}
