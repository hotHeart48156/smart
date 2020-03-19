package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class PlatformServiceController{
    @Autowired
private PlatformServiceService service;
@ApiOperation("updatePlatformService)
@PostMapping("/update/PlatformService/")
public  void  update(PlatformServiceDto  dto){
service.PlatformService (dto) 
}
}
