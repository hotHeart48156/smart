package org.users.domain.dto.agg;

@Data
public class IntegrationDto {
    private String UserId;
    private String integration;

    public void accept(User user) {
        user.setUserId(ValueObjectFactory.newInstance(UserId.class, this.UserId));
        user.setIntegration(ValueObjectFactory.newInstance(Integration.class, this.integration));
    }
}
