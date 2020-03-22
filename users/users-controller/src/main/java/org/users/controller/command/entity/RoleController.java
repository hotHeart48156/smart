package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RoleController{
    @Autowired
private RoleService service;
@ApiOperation("updateRole)
@PostMapping("/update/Role/")
public  void  update(RoleDto  dto){
service.Role (dto) 
}
}
