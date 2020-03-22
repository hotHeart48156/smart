package org.users;

import lombok.extern.slf4j.Slf4j;
import org.axonframework.commandhandling.CommandExecutionException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.BirthdayDto;
import org.users.dto.agg.GrowthDto;
import org.users.dto.agg.JobDto;
import org.users.dto.agg.PasswordDto;
import org.users.dto.entity.AddressDto;

/**
 * @author "yangbiao"
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    private UserApplicationImpl application=new UserApplicationImpl();
    @PostMapping(value = "create")
    public void create(CreateUserDto createUserDto) {
        try {
          application.createUser(createUserDto);


        } catch (CommandExecutionException ecp) {
            log.warn("add command failed with message", ecp.getMessage());

        }

    }
    @PostMapping(value = "update/address")
    public void updateAddress(AddressDto addressDto) {
        try {
            application.updateAddress(addressDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/password")
    public void updatePassword(PasswordDto passwordDto) {
        try {
            application.updatePassword(passwordDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/nickname")
    public void updateNickname(NicknameDto nicknameDto) {
        try {
            application.updateNickname(nicknameDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/phone")
    public void updatePhone(PhoneDto phoneDto) {
        try {
            application.updatePhone(phoneDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/birthday")
    public void updateBirthday(BirthdayDto birthdayDto) {
        try {
            application.updateBirthday(birthdayDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/job")
    public void updateJob(JobDto jobDto) {
        try {
            application.updateJob(jobDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
    @PostMapping(value = "update/growth")
    public void updateGrowth(GrowthDto growthDto) {
        try {
            application.updateGrowth(growthDto);

        }catch (CommandExecutionException e){
            log.warn("update address failure with message"+e.getMessage());
        }
    }
}
