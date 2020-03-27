package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.IntegrationConsumeSettingDto;
import org.users.service.command.IntegrationConsumeSettingService;

@RestController("/query/")
public class IntegrationConsumeSettingController{
    @Autowired
private IntegrationConsumeSettingService service;
@PostMapping(value="IntegrationConsumeSetting")
public  void  query(IntegrationConsumeSettingDto dto){
service.IntegrationConsumeSetting (dto); 
}
}
