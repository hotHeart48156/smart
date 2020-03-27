package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.IntegrationConsumeSettingDto;
import org.users.service.command.IntegrationConsumeSettingService;


@RestController(value="/update")
public class IntegrationConsumeSettingController{
    @Autowired
private IntegrationConsumeSettingService service;
@PostMapping(value=" entityFile ")
public  void  update(IntegrationConsumeSettingDto  dto){
service.IntegrationConsumeSetting (dto); 
}
}
