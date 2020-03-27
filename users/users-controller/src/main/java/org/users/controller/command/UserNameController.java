package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.UserNameDto;
import org.users.service.command.UserNameService;


@RestController(value="/update")
public class UserNameController{
    @Autowired
private UserNameService service;
@PostMapping(value=" entityFile ")
public  void  update(UserNameDto dto){
service.UserName (dto); 
}
}
