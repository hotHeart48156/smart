package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.WeixinOpenId;
import org.users.dto.agg.AbstractUserDto;

public class WeixinOpenIdDto  extends AbstractUserDto {
private String weixinOpenId;
@Override
public void  execute(User user){
user.setWeixinOpenId(ValueObjectFactory.newInstance(WeixinOpenId.class,weixinOpenId));
}
}
