package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketStatusServiceController{
    @Autowired
private RedPacketStatusServiceService service;
@ApiOperation("updateRedPacketStatusService)
@PostMapping("/update/RedPacketStatusService/")
public  void  update(RedPacketStatusServiceDto  dto){
service.RedPacketStatusService (dto) 
}
}
