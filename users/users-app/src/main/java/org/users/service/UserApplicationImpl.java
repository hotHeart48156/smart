package org.users.service;


import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.api.UserApplication;
import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.domain.customer.aggregation.User;
import org.users.domain.customer.repository.UserRepository;
import org.users.domain.customer.valueobject.ValueObjectFactory;
import org.users.domain.customer.valueobject.id.UserId;
import org.users.dto.*;
import org.users.executor.AbstractCommand;
import org.users.executor.command.CreateUserCommand;

import java.util.Optional;

/**
 * @author "yangbiao"
 */
public class UserApplicationImpl implements UserApplication {
    @Autowired
    private CommandGateway commandGateway;
    @Autowired
    private QueryGateway queryGateway;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(CreateUserDto createUserDto) {
        CreateUserCommand createUserCommand = new CreateUserCommand(createUserDto);
        User user = new User(createUserCommand);
        userRepository.save(user);
    }


    public void updateAddress(AddressDto addressDto) {

    }

    public void updatePassword(PasswordDto passwordDto) {
    }

    public void updateNickname(NicknameDto nicknameDto) {
    }

    public void updatePhone(PhoneDto phoneDto) {
    }

    public void updateBirthday(BirthdayDto birthdayDto) {
    }

    public void updateJob(JobDto jobDto) {
    }

    public void updateGrwoth(GrowthDto growthDto) {
    }


}
