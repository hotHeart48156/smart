package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class ActivityUserServiceController{
    @Autowired
private ActivityUserServiceService service;
@ApiOperation("updateActivityUserService)
@PostMapping("/update/ActivityUserService/")
public  void  update(ActivityUserServiceDto  dto){
service.ActivityUserService (dto) 
}
}
