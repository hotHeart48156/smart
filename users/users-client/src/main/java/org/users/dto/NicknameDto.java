package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.NickName;

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
