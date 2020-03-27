package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.UserIntegrationRuleDto;
import org.users.service.command.UserIntegrationRuleService;

@RestController("/query/")
public class UserIntegrationRuleController{
    @Autowired
private UserIntegrationRuleService service;
@PostMapping(value="UserIntegrationRule")
public  void  query(UserIntegrationRuleDto dto){
service.UserIntegrationRule (dto); 
}
}
