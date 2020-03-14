package org.users.domain.dto.agg;

@Data
public class IdDto {
    private String UserId;
    private String memberStatisticsInfoId;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setId(ValueObjectFactory.newInstance(Id.class, this.memberStatisticsInfoId));
    }
}
