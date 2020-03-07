package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.PhoneNumber;
import org.users.domain.valueobject.ValueObjectFactory;

/**
 * @author "yangbiao"
 */
public class PhoneDto extends AbstractDto {
    private String id;
    private String phone;

    @Override
    public void accept(User user) {
        if (id.equals(user.getUserId().getId())) {
            user.setPhoneNumber(ValueObjectFactory.newInstance(PhoneNumber.class, phone ));
        }
    }

}
