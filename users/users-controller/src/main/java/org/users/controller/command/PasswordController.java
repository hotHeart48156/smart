package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.PasswordDto;
import org.users.service.command.PasswordService;


@RestController(value="/update")
public class PasswordController{
    @Autowired
private PasswordService service;
@PostMapping(value=" entityFile ")
public  void  update(PasswordDto dto){
service.Password (dto); 
}
}
