package org.users.dto.domainevent;

import lombok.Data;
import org.users.domain.customer.aggregation.UserUpdateDto;

/**
 * @author OMEN
 */
@Data
public class UpdateUserEvent {
    private UserUpdateDto userUpdateDto;

    private UpdateUserEvent(UserUpdateDto userUpdateDto) {
        this.userUpdateDto = userUpdateDto;
    }
}
