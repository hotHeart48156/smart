package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.icon.UserIcon;

@Data
public class UserIconDto {
    private String UserId;
    private String userIcon;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setUserIcon(ValueObjectFactory.newInstance(UserIcon.class, this.userIcon));
    }
}
