package org.users.domain.dto.agg;

@Data
public class UserNameDto {
    private String UserId;
    private String userName;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setUserName(ValueObjectFactory.newInstance(UserName.class, this.userName));
    }
}
