package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketTypeServiceController{
    @Autowired
private RedPacketTypeServiceService service;
@ApiOperation("updateRedPacketTypeService)
@PostMapping("/update/RedPacketTypeService/")
public  void  update(RedPacketTypeServiceDto  dto){
service.RedPacketTypeService (dto) 
}
}
