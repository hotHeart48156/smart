package org.users.dto;

import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.name.NickName;

/**
 * @author "yangbiao"
 */
public class NicknameDto extends AbstractDto {
    private String id;
    private String nickname;

    @Override
    public void accept(User user) {
        if (id.equals(user.getUserId().getId())) {
            user.setNickName(ValueObjectFactory.newInstance(NickName.class, nickname.getClass()));
        }
    }

}
