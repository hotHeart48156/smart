package  org.activite.controller.update;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")public class ActivityUserServiceController{
    @Autowired
private ActivityUserServiceService service;
@ApiOperation("updateActivityUserService)
@PostMapping(value=" entityFile ")
public  void  update(ActivityUserServiceDto  dto){
service.ActivityUserService (dto) 
}
}
