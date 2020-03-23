package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.dto.agg.AbstractUserDto;

public class GrowthDto  extends AbstractUserDto {
private String growth;
@Override
public void  execute(User user){
user.setGrowth(ValueObjectFactory.newInstance(Growth.class,growth));
}
}
