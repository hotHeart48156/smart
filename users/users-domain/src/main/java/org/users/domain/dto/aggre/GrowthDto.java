package org.users.domain.dto.agg;

@Data
public class GrowthDto {
    private String UserId;
    private String growth;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setGrowth(ValueObjectFactory.newInstance(Growth.class, this.growth));
    }
}
