package org.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.users.domain.aggregation.User;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.user.Birthday;

import java.util.Date;

/**
 * @author "yangbiao"
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class BirthdayDto extends AbstractDto {
    private String userId;
    private Date birthday;

    @Override
    public void accept(User user) {
        if (this.userId.equals(user.getUserId().getId())) {
            user.setBirthday(ValueObjectFactory.newInstance(Birthday.class, this.birthday ));
        }
    }
}
