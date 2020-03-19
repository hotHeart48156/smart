package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class StartTimeServiceController{
    @Autowired
private StartTimeServiceService service;
@ApiOperation("updateStartTimeService)
@PostMapping("/update/StartTimeService/")
public  void  update(StartTimeServiceDto  dto){
service.StartTimeService (dto) 
}
}
