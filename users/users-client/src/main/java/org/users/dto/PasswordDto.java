package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Password;

/**
 * @author "yangbiao"
 */
public class PasswordDto extends AbstractDto {
    private String id;
    private String password;

    @Override
    public void accept(User user) {
        if (id.equals(user.getUserId().getId())) {
            user.setPassword(ValueObjectFactory.newInstance(Password.class, password.getClass()));
        }
    }

}
