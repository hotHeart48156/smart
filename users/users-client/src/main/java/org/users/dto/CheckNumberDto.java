package org.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Value;
import org.users.domain.aggregation.User;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class CheckNumberDto extends AbstractDto {
    private String phone;
    private String password;

    @Override
    public void accept(User user) {

    }
}
