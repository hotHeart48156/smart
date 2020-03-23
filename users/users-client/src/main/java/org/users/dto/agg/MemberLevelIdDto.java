package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.id.MemberLevelId;

public class MemberLevelIdDto  extends AbstractUserDto {
private String memberLevelId;
@Override
public void  execute(User user){
user.setMemberLevelId(ValueObjectFactory.newInstance(MemberLevelId.class,memberLevelId));
}
}
