package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Job;

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
