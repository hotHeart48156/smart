package org.users.api;


import org.users.dto.entity.CreateUserDto;

/**
 * @author "yangbiao"
 */
public interface UserApplication {
    void createUser(CreateUserDto createUserDto);

}
