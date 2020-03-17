package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.ValueObjectFactory;

@Data
public class GrowthDto {
    private String UserId;
    private String growth;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setGrowth(ValueObjectFactory.newInstance(Growth.class, this.growth));
    }
}
