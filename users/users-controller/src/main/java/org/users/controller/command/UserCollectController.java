package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.UserCollectDto;
import org.users.service.command.UserCollectService;


@RestController(value="/update")
public class UserCollectController{
    @Autowired
private UserCollectService service;
@PostMapping(value=" entityFile ")
public  void  update(UserCollectDto  dto){
service.UserCollect (dto); 
}
}
