package  org.users.controller.command.aggre;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserController{
    @Autowired
private UserService service;
@ApiOperation("updateUser)
@PostMapping("/update/User/")
public  void  update(UserDto  dto){
service.User (dto) 
}
}
