package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.integration.Integration;
import org.users.dto.agg.AbstractUserDto;

public class IntegrationDto  extends AbstractUserDto {
private String integration;
@Override
public void  execute(User user){
user.setIntegration(ValueObjectFactory.newInstance(Integration.class,integration));
}
}
