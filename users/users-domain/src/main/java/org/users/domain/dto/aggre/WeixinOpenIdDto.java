package org.users.domain.dto.agg;

@Data
public class WeixinOpenIdDto {
    private String UserId;
    private String weixinOpenId;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setWeixinOpenId(ValueObjectFactory.newInstance(WeixinOpenId.class, this.weixinOpenId));
    }
}
