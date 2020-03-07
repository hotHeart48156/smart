package org.users.api;


import org.users.dto.CreateUserDto;

/**
 * @author "yangbiao"
 */
public interface UserApplication {
    void createUser(CreateUserDto createUserDto);

}
