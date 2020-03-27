package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.UserStatusDto;
import org.users.service.command.UserStatusService;


@RestController(value="/update")
public class UserStatusController{
    @Autowired
private UserStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(UserStatusDto dto){
service.UserStatus (dto); 
}
}
