package org.users.dto;

import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.valueobject.Growth;
import org.users.domain.customer.valueobject.ValueObjectFactory;

/**
 * @author "yangbiao"
 */
public class IntegrationDto extends AbstractDto {
    private String id;
    private Integer integer;

    @Override
    public void accept(User user) {
        if (id.equals(user.getUserId().getId())) {
            user.setGrowth(ValueObjectFactory.newInstance(Growth.class, integer.getClass()));
        }
    }

}
