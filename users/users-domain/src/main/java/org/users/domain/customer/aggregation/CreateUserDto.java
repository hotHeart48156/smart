package org.users.domain.customer.aggregation;

import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.valueobject.CreateTime;
import org.users.domain.customer.valueobject.PhoneNumber;
import org.users.domain.customer.valueobject.ValueObject;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.name.NickName;
import org.users.domain.customer.valueobject.name.UserName;
import org.users.domain.customer.valueobject.user.Birthday;
import org.users.domain.customer.valueobject.user.Gender;
import org.users.domain.customer.valueobject.user.Password;

import java.util.Date;

/**
 * @author "yangbiao"
 */
public class CreateUserDto {
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 手机号码
     */
    private String phone;

    private Integer gender;

    /**
     * 生日
     */
    private Date birthday;

    public void accept(User user) {
        user.setUserName(ValueObjectFactory.newInstance(UserName.class, username.getClass()));
        user.setNickName(ValueObjectFactory.newInstance(NickName.class, nickname.getClass()));
        user.setPassword(ValueObjectFactory.newInstance(Password.class, password.getClass()));
        user.setPhoneNumber(ValueObjectFactory.newInstance(PhoneNumber.class, phone.getClass()));
        user.setGender(ValueObjectFactory.newInstance(Gender.class, gender.getClass()));
        user.setBirthday(ValueObjectFactory.newInstance(Birthday.class, birthday.getClass()));
        user.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, new Date(System.currentTimeMillis()).getClass()));


    }

}
