package org.users.dto.agg;

import org.users.domain.aggregation.User;
import org.users.dto.AbstractDto;

/**
 * @author yangbiao
 */

public abstract class AbstractUserDto extends AbstractDto {
    private String userId;
    public void accept(User user){
        if (user.getUserId().getId().equals(userId)){
            execute(user);
        }
    }
    public abstract void execute(User user);
}
