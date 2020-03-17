package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Birthday;

@Data
public class BirthdayDto {
    private String UserId;
    private String birthday;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setBirthday(ValueObjectFactory.newInstance(Birthday.class, this.birthday));
    }
}
