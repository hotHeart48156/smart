package org.users.domain.dto.agg;

@Data
public class CreateTimeDto {
    private String UserId;
    private String createTime;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, this.createTime));
    }
}
