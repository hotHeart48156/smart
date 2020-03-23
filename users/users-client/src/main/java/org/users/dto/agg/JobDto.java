package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Job;

public class JobDto  extends AbstractUserDto {
private String job;
@Override
public void  execute(User user){
user.setJob(ValueObjectFactory.newInstance(Job.class,job));
}
}
