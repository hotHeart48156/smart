package org.users.dto;

import org.users.domain.aggregation.User;
import org.users.domain.valueobject.Growth;
import org.users.domain.valueobject.ValueObjectFactory;

/**
 * @author "yangbiao"
 */
public class GrowthDto extends AbstractDto {
    private String userId;
    private Integer growth;

    @Override
    public void accept(User user) {
        if (userId.equals(user.getUserId().getId())) {
            user.setGrowth(ValueObjectFactory.newInstance(Growth.class, growth ));
        }
    }

}
