package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class IntegrationConsumeSettingController{
    @Autowired
private IntegrationConsumeSettingService service;
@ApiOperation("updateIntegrationConsumeSetting)
@PostMapping("/update/IntegrationConsumeSetting/")
public  void  update(IntegrationConsumeSettingDto  dto){
service.IntegrationConsumeSetting (dto) 
}
}
