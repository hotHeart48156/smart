package org.users.domain.dto.agg;

@Data
public class NickNameDto {
    private String UserId;
    private String nickName;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setNickName(ValueObjectFactory.newInstance(NickName.class, this.nickName));
    }
}
