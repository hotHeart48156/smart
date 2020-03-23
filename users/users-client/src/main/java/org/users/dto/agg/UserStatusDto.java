package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.status.UserStatus;
import org.users.dto.agg.AbstractUserDto;

public class UserStatusDto  extends AbstractUserDto {
private String userStatus;
@Override
public void  execute(User user){
user.setUserStatus(ValueObjectFactory.newInstance(UserStatus.class,userStatus));
}
}
