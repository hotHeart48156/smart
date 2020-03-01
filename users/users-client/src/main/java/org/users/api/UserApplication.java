package org.users.api;


import org.users.domain.customer.aggregation.CreateUserDto;
import org.users.dto.CheckNumberDto;
import org.users.dto.OpenidDto;

/**
 * @author "yangbiao"
 */
public interface UserApplication {
    void createUser(CreateUserDto createUserDto);

}
