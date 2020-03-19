package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class SendTimeServiceController{
    @Autowired
private SendTimeServiceService service;
@ApiOperation("updateSendTimeService)
@PostMapping("/update/SendTimeService/")
public  void  update(SendTimeServiceDto  dto){
service.SendTimeService (dto) 
}
}
