package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.UserIconDto;
import org.users.service.command.UserIconService;


@RestController(value="/update")
public class UserIconController{
    @Autowired
private UserIconService service;
@PostMapping(value=" entityFile ")
public  void  update(UserIconDto dto){
service.UserIcon (dto); 
}
}
