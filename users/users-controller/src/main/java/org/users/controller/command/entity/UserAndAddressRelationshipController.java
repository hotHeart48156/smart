package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserAndAddressRelationshipController{
    @Autowired
private UserAndAddressRelationshipService service;
@ApiOperation("updateUserAndAddressRelationship)
@PostMapping("/update/UserAndAddressRelationship/")
public  void  update(UserAndAddressRelationshipDto  dto){
service.UserAndAddressRelationship (dto) 
}
}
