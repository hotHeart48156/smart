package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.NickName;

@Data
public class NickNameDto {
    private String UserId;
    private String nickName;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setNickName(ValueObjectFactory.newInstance(NickName.class, this.nickName));
    }
}
