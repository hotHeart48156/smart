package  org.users.controller.command.entity;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.service.command.RoleService;

public class RoleController{
    @Autowired
private RoleService service;
@ApiOperation("updateRole)
@PostMapping("/update/Role/")
public  void  update(RoleDto  dto){
service.Role (dto) 
}
}
