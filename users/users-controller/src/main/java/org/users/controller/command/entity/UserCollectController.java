package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserCollectController{
    @Autowired
private UserCollectService service;
@ApiOperation("updateUserCollect)
@PostMapping("/update/UserCollect/")
public  void  update(UserCollectDto  dto){
service.UserCollect (dto) 
}
}
