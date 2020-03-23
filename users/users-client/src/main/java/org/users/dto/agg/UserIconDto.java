package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.icon.UserIcon;
import org.users.dto.agg.AbstractUserDto;

public class UserIconDto  extends AbstractUserDto {
private String userIcon;
@Override
public void  execute(User user){
user.setUserIcon(ValueObjectFactory.newInstance(UserIcon.class,userIcon));
}
}
