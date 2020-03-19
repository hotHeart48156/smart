package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserLevelServiceController{
    @Autowired
private UserLevelServiceService service;
@ApiOperation("updateUserLevelService)
@PostMapping("/update/UserLevelService/")
public  void  update(UserLevelServiceDto  dto){
service.UserLevelService (dto) 
}
}
