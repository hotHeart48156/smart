package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class RoleController{
    @Autowired
private RoleService service;
@PostMapping(value="Role") 
public  void  query(RoleDto  dto){
service.Role (dto); 
}
}
