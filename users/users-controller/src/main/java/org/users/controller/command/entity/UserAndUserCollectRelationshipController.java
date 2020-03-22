package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserAndUserCollectRelationshipController{
    @Autowired
private UserAndUserCollectRelationshipService service;
@ApiOperation("updateUserAndUserCollectRelationship)
@PostMapping("/update/UserAndUserCollectRelationship/")
public  void  update(UserAndUserCollectRelationshipDto  dto){
service.UserAndUserCollectRelationship (dto) 
}
}
