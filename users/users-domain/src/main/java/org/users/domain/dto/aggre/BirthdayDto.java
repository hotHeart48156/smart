package org.users.domain.dto.agg;

@Data
public class BirthdayDto {
    private String UserId;
    private String birthday;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setBirthday(ValueObjectFactory.newInstance(Birthday.class, this.birthday));
    }
}
