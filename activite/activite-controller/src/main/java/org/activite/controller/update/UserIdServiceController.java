package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class UserIdServiceController{
    @Autowired
private UserIdServiceService service;
@ApiOperation("updateUserIdService)
@PostMapping("/update/UserIdService/")
public  void  update(UserIdServiceDto  dto){
service.UserIdService (dto) 
}
}
