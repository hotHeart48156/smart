package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.PhoneNumber;
import org.users.domain.valueobject.ValueObjectFactory;

@Data
public class PhoneNumberDto {
    private String UserId;
    private String phoneNumber;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setPhoneNumber(ValueObjectFactory.newInstance(PhoneNumber.class, this.phoneNumber));
    }
}
