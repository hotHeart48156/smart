package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Gender;

@Data
public class GenderDto {
    private String UserId;
    private String gender;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setGender(ValueObjectFactory.newInstance(Gender.class, this.gender));
    }
}
