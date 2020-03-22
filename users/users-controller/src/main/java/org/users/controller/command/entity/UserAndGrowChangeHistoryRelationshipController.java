package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserAndGrowChangeHistoryRelationshipController{
    @Autowired
private UserAndGrowChangeHistoryRelationshipService service;
@ApiOperation("updateUserAndGrowChangeHistoryRelationship)
@PostMapping("/update/UserAndGrowChangeHistoryRelationship/")
public  void  update(UserAndGrowChangeHistoryRelationshipDto  dto){
service.UserAndGrowChangeHistoryRelationship (dto) 
}
}
