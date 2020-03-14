package org.users.domain.dto.agg;

@Data
public class PasswordDto {
    private String UserId;
    private String password;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setPassword(ValueObjectFactory.newInstance(Password.class, this.password));
    }
}
