package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;

@Data
public class PasswordDto {
    private String UserId;
    private String password;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setPassword(ValueObjectFactory.newInstance(Password.class, this.password));
    }
}
