package org.users.dto;

import org.checkerframework.checker.units.qual.A;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.user.Job;

/**
 * @author "yangbiao"
 */
public class JobDto extends AbstractDto {
    private String job;
    private String id;

    @Override
    public void accept(User user) {
        if (id.equals(user.getUserId().getId())) {
            user.setJob(ValueObjectFactory.newInstance(Job.class, job.getClass()));
        }
    }

}
