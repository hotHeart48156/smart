package org.users.dto.domainevent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.name.NickName;
import org.users.dto.NicknameDto;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
public class UpdateNicknameEvent extends AbstractEvent {
    NicknameDto nicknameDto;
}
