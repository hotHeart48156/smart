package org.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandExecutionException;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.CreateUserDto;
import org.users.dto.*;
import org.users.executor.command.*;

/**
 * @author "yangbiao"
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private CommandGateway commandGateway;

    @PostMapping(value = "create")
    public void create(CreateUserDto createUserDto) {
        try {
            CreateUserCommand createUserCommand = new CreateUserCommand(createUserDto);
            commandGateway.sendAndWait(createUserCommand);


        } catch (CommandExecutionException ecp) {
            log.warn("add command failed with message", ecp.getMessage());

        }

    }
    @PostMapping(value = "update/address")
    public void updateAddress(AddressDto addressDto) {
        try {
            commandGateway.sendAndWait(new UpdateAddressCommand(addressDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/password")
    public void updatePassword(PasswordDto passwordDto) {
        try {
            commandGateway.sendAndWait(new UpdatePasswordCommand(passwordDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/nickname")
    public void updateNickname(NicknameDto nicknameDto) {
        try {
            commandGateway.sendAndWait(new UpdateNicknameCommand(nicknameDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/phone")
    public void updatePhone(PhoneDto phoneDto) {
        try {
            commandGateway.sendAndWait(new UpdatePhoneCommand(phoneDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/birthday")
    public void updateBirthday(BirthdayDto birthdayDto) {
        try {
            commandGateway.sendAndWait(new UpdateBirthdayCommand(birthdayDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/job")
    public void updateJob(JobDto jobDto) {
        try {
            commandGateway.sendAndWait(new UpdateJobCommand(jobDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/growth")
    public void updateGrowth(GrowthDto growthDto) {
        try {
            commandGateway.sendAndWait(new UpdateGrowthCommand(growthDto));

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
}
