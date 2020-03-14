package org.users.domain.dto.agg;

@Data
public class JobDto {
    private String UserId;
    private String job;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setJob(ValueObjectFactory.newInstance(Job.class, this.job));
    }
}
