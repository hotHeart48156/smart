package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.RoleDto;
import org.users.service.command.RoleService;


@RestController(value="/update")
public class RoleController{
    @Autowired
private RoleService service;
@PostMapping(value=" entityFile ")
public  void  update(RoleDto  dto){
service.Role (dto); 
}
}
