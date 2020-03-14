package org.users.domain.dto.agg;

@Data
public class UserIconDto {
    private String UserId;
    private String userIcon;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setUserIcon(ValueObjectFactory.newInstance(UserIcon.class, this.userIcon));
    }
}
