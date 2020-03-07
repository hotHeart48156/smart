package org.users.service;


import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.api.UserApplication;
import org.users.dto.CreateUserDto;
import org.users.dto.*;
import org.users.executor.command.CreateUserCommand;

/**
 * @author "yangbiao"
 */
public class UserApplicationImpl implements UserApplication {
    @Autowired
    private CommandGateway commandGateway;
    @Autowired
    private QueryGateway queryGateway;

    @Override
    public void createUser(CreateUserDto createUserDto) {
        CreateUserCommand createUserCommand = new CreateUserCommand(createUserDto);
        commandGateway.sendAndWait(createUserCommand);

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

    public void updateGrowth(GrowthDto growthDto) {
    }


}
