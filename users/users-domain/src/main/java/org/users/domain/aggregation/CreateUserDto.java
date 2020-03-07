package org.users.domain.aggregation;

import org.users.domain.valueobject.CreateTime;
import org.users.domain.valueobject.PhoneNumber;
import org.users.domain.valueobject.ValueObjectFactory;
import org.users.domain.valueobject.name.NickName;
import org.users.domain.valueobject.name.UserName;
import org.users.domain.valueobject.user.Gender;
import org.users.domain.valueobject.user.Password;

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


    public void accept(User user) {
        user.setUserName(ValueObjectFactory.newInstance(UserName.class, username.getClass()));
        user.setNickName(ValueObjectFactory.newInstance(NickName.class, nickname.getClass()));
        user.setPassword(ValueObjectFactory.newInstance(Password.class, password.getClass()));
        user.setPhoneNumber(ValueObjectFactory.newInstance(PhoneNumber.class, phone.getClass()));
        user.setGender(ValueObjectFactory.newInstance(Gender.class, gender.getClass()));
        user.setCreateTime(ValueObjectFactory.newInstance(CreateTime.class, new Date(System.currentTimeMillis()).getClass()));


    }

}
