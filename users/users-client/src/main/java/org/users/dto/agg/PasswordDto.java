package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Password;

public class PasswordDto  extends AbstractUserDto {
private String password;
@Override
public void  execute(User user){
user.setPassword(ValueObjectFactory.newInstance(Password.class,password));
}
}
