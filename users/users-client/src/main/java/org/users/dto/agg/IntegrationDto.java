package org.users.dto.agg;

import lombok.Data;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.integration.Integration;

@Data
public class IntegrationDto {
    private String UserId;
    private String integration;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(org.users.domain.valueobject.id.UserId.class, this.UserId));
        user.setIntegration(ValueObjectFactory.newInstance(Integration.class, this.integration));
    }
}
