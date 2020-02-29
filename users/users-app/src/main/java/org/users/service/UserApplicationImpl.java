package org.users.service;

import com.geekhalo.ddd.lite.domain.DomainEventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.users.api.UserApplication;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.domain.customer.aggregation.UserRepository;
import org.users.domain.customer.aggregation.LoginWithNameOrNumberDto;
import org.users.domain.customer.aggregation.LoginWithOpenidDto;

/**
 * @author "yangbiao"
 */
public class UserApplicationImpl implements UserApplication, ApplicationEventPublisherAware {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void createUser(CreateUserDto createUserDto) {
        userRepository.save(createUserDto.accept(new User()));
    }

    @Override
    public void loginWithNameOrTelephone(LoginWithNameOrNumberDto nameOrNumberDto) {

    }

    @Override
    public void loginWithOpenid(LoginWithOpenidDto openid) {

    }


    /**
     * Set the ApplicationEventPublisher that this object runs in.
     * <p>Invoked after population of normal bean properties but before an init
     * callback like InitializingBean's afterPropertiesSet or a custom init-method.
     * Invoked before ApplicationContextAware's setApplicationContext.
     *
     * @param applicationEventPublisher event publisher to be used by this object
     */

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }
}
