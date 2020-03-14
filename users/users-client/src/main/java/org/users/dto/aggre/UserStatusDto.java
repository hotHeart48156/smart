package org.users.domain.dto.agg;

@Data
public class UserStatusDto {
    private String UserId;
    private String userStatus;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class, this.userStatus));
    }
}
