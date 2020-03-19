package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class EndTimeServiceController{
    @Autowired
private EndTimeServiceService service;
@ApiOperation("updateEndTimeService)
@PostMapping("/update/EndTimeService/")
public  void  update(EndTimeServiceDto  dto){
service.EndTimeService (dto) 
}
}
