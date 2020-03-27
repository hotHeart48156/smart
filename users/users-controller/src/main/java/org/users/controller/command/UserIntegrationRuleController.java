package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.UserIntegrationRuleDto;
import org.users.service.command.UserIntegrationRuleService;


@RestController(value="/update")
public class UserIntegrationRuleController{
    @Autowired
private UserIntegrationRuleService service;
@PostMapping(value=" entityFile ")
public  void  update(UserIntegrationRuleDto  dto){
service.UserIntegrationRule (dto); 
}
}
