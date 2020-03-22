package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserIntegrationRuleController{
    @Autowired
private UserIntegrationRuleService service;
@ApiOperation("updateUserIntegrationRule)
@PostMapping("/update/UserIntegrationRule/")
public  void  update(UserIntegrationRuleDto  dto){
service.UserIntegrationRule (dto) 
}
}
