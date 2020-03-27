package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class UserController{
    @Autowired
private UserService service;
@PostMapping(value="User") 
public  void  query(UserDto  dto){
service.User (dto); 
}
}
