package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.type.SourceType;

public class SourceTypeDto  extends AbstractUserDto {
private String sourceType;
@Override
public void  execute(User user){
user.setSourceType(ValueObjectFactory.newInstance(SourceType.class,sourceType));
}
}
