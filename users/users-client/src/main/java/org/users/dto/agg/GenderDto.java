package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Gender;
import org.users.dto.agg.AbstractUserDto;

public class GenderDto  extends AbstractUserDto {
private String gender;
@Override
public void  execute(User user){
user.setGender(ValueObjectFactory.newInstance(Gender.class,gender));
}
}
