package org.users.domain.dto.agg;

@Data
public class GenderDto {
    private String UserId;
    private String gender;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setGender(ValueObjectFactory.newInstance(Gender.class, this.gender));
    }
}
