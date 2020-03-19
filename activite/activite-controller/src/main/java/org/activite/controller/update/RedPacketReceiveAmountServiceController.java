package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketReceiveAmountServiceController{
    @Autowired
private RedPacketReceiveAmountServiceService service;
@ApiOperation("updateRedPacketReceiveAmountService)
@PostMapping("/update/RedPacketReceiveAmountService/")
public  void  update(RedPacketReceiveAmountServiceDto  dto){
service.RedPacketReceiveAmountService (dto) 
}
}
