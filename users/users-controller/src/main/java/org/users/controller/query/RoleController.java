package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.RoleDto;
import org.users.service.command.RoleService;

@RestController("/query/")
public class RoleController{
    @Autowired
private RoleService service;
@PostMapping(value="Role")
public  void  query(RoleDto dto){
service.Role (dto); 
}
}
