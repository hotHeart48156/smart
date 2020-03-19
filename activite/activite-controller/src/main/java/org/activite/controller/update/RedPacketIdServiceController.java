package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketIdServiceController{
    @Autowired
private RedPacketIdServiceService service;
@ApiOperation("updateRedPacketIdService)
@PostMapping("/update/RedPacketIdService/")
public  void  update(RedPacketIdServiceDto  dto){
service.RedPacketIdService (dto) 
}
}
