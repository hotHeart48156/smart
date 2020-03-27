package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class UserIntegrationRuleController{
    @Autowired
private UserIntegrationRuleService service;
@PostMapping(value="UserIntegrationRule") 
public  void  query(UserIntegrationRuleDto  dto){
service.UserIntegrationRule (dto); 
}
}
