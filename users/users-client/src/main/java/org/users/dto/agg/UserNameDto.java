package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.UserName;
import org.users.dto.agg.AbstractUserDto;

public class UserNameDto  extends AbstractUserDto {
private String userName;
@Override
public void  execute(User user){
user.setUserName(ValueObjectFactory.newInstance(UserName.class,userName));
}
}
