package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class AppletSetController{
    @Autowired
private AppletSetService service;
@ApiOperation("updateAppletSet)
@PostMapping("/update/AppletSet/")
public  void  update(AppletSetDto  dto){
service.AppletSet (dto) 
}
}
