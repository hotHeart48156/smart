package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketCountServiceController{
    @Autowired
private RedPacketCountServiceService service;
@ApiOperation("updateRedPacketCountService)
@PostMapping("/update/RedPacketCountService/")
public  void  update(RedPacketCountServiceDto  dto){
service.RedPacketCountService (dto) 
}
}
