package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class IntegrationConsumeSettingController{
    @Autowired
private IntegrationConsumeSettingService service;
@PostMapping(value="IntegrationConsumeSetting") 
public  void  query(IntegrationConsumeSettingDto  dto){
service.IntegrationConsumeSetting (dto); 
}
}
