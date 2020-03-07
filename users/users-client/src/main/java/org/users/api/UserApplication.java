package org.users.api;


import org.users.domain.aggregation.CreateUserDto;

/**
 * @author "yangbiao"
 */
public interface UserApplication {
    void createUser(CreateUserDto createUserDto);

}
