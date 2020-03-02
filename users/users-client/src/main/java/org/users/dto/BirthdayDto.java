package org.users.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.domain.customer.valueobject.user.Birthday;

import javax.validation.ValidatorFactory;
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
            user.setBirthday(ValueObjectFactory.newInstance(Birthday.class, this.birthday.getClass()));
        }
    }
}