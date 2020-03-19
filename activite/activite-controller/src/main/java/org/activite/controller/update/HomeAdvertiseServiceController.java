package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class HomeAdvertiseServiceController{
    @Autowired
private HomeAdvertiseServiceService service;
@ApiOperation("updateHomeAdvertiseService)
@PostMapping("/update/HomeAdvertiseService/")
public  void  update(HomeAdvertiseServiceDto  dto){
service.HomeAdvertiseService (dto) 
}
}
