package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.WeixinOpenId;

@Data
public class WeixinOpenIdDto {
    private String UserId;
    private String weixinOpenId;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setWeixinOpenId(ValueObjectFactory.newInstance(WeixinOpenId.class, this.weixinOpenId));
    }
}
