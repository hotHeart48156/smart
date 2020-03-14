package org.users.domain.dto.agg;

@Data
public class PhoneNumberDto {
    private String UserId;
    private String phoneNumber;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setPhoneNumber(ValueObjectFactory.newInstance(PhoneNumber.class, this.phoneNumber));
    }
}
