package org.users.domain.dto.agg;

@Data
public class UserIdDto {
    private String UserId;
    private String userId;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.userId));
    }
}
