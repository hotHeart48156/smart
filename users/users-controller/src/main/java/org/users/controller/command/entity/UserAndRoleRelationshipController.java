package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserAndRoleRelationshipController{
    @Autowired
private UserAndRoleRelationshipService service;
@ApiOperation("updateUserAndRoleRelationship)
@PostMapping("/update/UserAndRoleRelationship/")
public  void  update(UserAndRoleRelationshipDto  dto){
service.UserAndRoleRelationship (dto) 
}
}
