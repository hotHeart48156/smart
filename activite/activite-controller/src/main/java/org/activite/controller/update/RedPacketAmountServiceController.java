package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketAmountServiceController{
    @Autowired
private RedPacketAmountServiceService service;
@ApiOperation("updateRedPacketAmountService)
@PostMapping("/update/RedPacketAmountService/")
public  void  update(RedPacketAmountServiceDto  dto){
service.RedPacketAmountService (dto) 
}
}
