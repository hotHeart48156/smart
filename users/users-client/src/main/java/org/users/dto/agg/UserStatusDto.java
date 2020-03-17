package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.status.UserStatus;

@Data
public class UserStatusDto {
    private String UserId;
    private String userStatus;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class, this.userStatus));
    }
}
