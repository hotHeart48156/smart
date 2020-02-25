package org.users.api;


import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.domain.customer.aggregation.LoginWithNameOrNumberDto;
import org.users.domain.customer.aggregation.LoginWithOpenid;

/**
 * @author "yangbiao"
 */
public interface UserApplication {
    void createUser(CreateUserDto createUserDto);

    void loginWithNameOrTelephone(LoginWithNameOrNumberDto nameOrNumberDto);

    void loginWithOpenid(LoginWithOpenid openid);
}
