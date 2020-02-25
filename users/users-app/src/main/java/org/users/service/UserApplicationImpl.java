package org.users.service;

import com.geekhalo.ddd.lite.domain.DomainEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.api.UserApplication;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.domain.customer.aggregation.UserRepository;
import org.users.domain.customer.aggregation.LoginWithNameOrNumberDto;
import org.users.domain.customer.aggregation.LoginWithOpenid;

/**
 * @author "yangbiao"
 */
public class UserApplicationImpl implements UserApplication {
    @Autowired
    UserRepository userRepository;
    @Autowired
    DomainEventBus domainEventBus;

    @Override
    public void createUser(CreateUserDto createUserDto) {
        userRepository.save(createUserDto.accept(new User()));
    }

    @Override
    public void loginWithNameOrTelephone(LoginWithNameOrNumberDto nameOrNumberDto) {

    }

    @Override
    public void loginWithOpenid(LoginWithOpenid openid) {

    }


}
