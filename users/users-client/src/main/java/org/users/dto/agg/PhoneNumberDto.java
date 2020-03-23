package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.PhoneNumber;
import org.users.domain.valueobject.ValueObjectFactory;

public class PhoneNumberDto  extends AbstractUserDto {
private String phoneNumber;
@Override
public void  execute(User user){
user.setPhoneNumber(ValueObjectFactory.newInstance(PhoneNumber.class,phoneNumber));
}
}
