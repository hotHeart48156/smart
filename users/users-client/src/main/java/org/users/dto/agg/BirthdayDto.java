package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Birthday;
import org.users.dto.agg.AbstractUserDto;

public class BirthdayDto  extends AbstractUserDto {
private String birthday;
@Override
public void  execute(User user){
user.setBirthday(ValueObjectFactory.newInstance(Birthday.class,birthday));
}
}
