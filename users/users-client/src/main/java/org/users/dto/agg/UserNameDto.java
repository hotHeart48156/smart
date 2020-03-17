package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.UserName;

@Data
public class UserNameDto {
    private String UserId;
    private String userName;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setUserName(ValueObjectFactory.newInstance(UserName.class, this.userName));
    }
}
