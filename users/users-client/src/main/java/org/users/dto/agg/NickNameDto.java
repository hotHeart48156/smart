package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.NickName;

public class NickNameDto  extends AbstractUserDto {
private String nickName;
@Override
public void  execute(User user){
user.setNickName(ValueObjectFactory.newInstance(NickName.class,nickName));
}
}
