package org.users.service;


import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.api.UserApplication;
import org.users.dto.CreateUserDto;
import org.users.dto.*;
import org.users.executor.command.*;

/**
 * @author "yangbiao"
 */
@Service
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
        UpdateAddressCommand addressCommand=new UpdateAddressCommand(addressDto);
        commandGateway.sendAndWait(addressCommand);
    }

    public void updatePassword(PasswordDto passwordDto) {
        UpdatePasswordCommand passwordCommand=new UpdatePasswordCommand(passwordDto);
        commandGateway.sendAndWait(passwordCommand);
    }

    public void updateNickname(NicknameDto nicknameDto) {
        UpdateNicknameCommand nicknameCommand=new UpdateNicknameCommand(nicknameDto);
        commandGateway.sendAndWait(nicknameCommand);
    }

    public void updatePhone(PhoneDto phoneDto) {
        UpdatePhoneCommand phoneCommand=new UpdatePhoneCommand(phoneDto);
        commandGateway.sendAndWait(phoneCommand);
    }

    public void updateBirthday(BirthdayDto birthdayDto) {
        UpdateBirthdayCommand birthdayCommand=new UpdateBirthdayCommand(birthdayDto);
        commandGateway.sendAndWait(birthdayCommand);
    }

    public void updateJob(JobDto jobDto) {
        UpdateJobCommand jobCommand=new UpdateJobCommand(jobDto);
        commandGateway.sendAndWait(jobCommand);
    }

    public void updateGrowth(GrowthDto growthDto) {
        UpdateGrowthCommand growthCommand=new UpdateGrowthCommand(growthDto);
        commandGateway.sendAndWait(growthCommand);
    }


}
