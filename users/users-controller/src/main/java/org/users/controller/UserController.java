package org.users.controller;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandExecutionException;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.checkerframework.checker.units.qual.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.domain.customer.valueobject.CommentGrowthPoint;
import org.users.dto.*;
import org.users.executor.command.CreateUserCommand;

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
