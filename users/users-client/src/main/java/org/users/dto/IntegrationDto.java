package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.ValueObjectFactory;

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
