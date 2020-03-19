package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class SingleRedPacketAmountServiceController{
    @Autowired
private SingleRedPacketAmountServiceService service;
@ApiOperation("updateSingleRedPacketAmountService)
@PostMapping("/update/SingleRedPacketAmountService/")
public  void  update(SingleRedPacketAmountServiceDto  dto){
service.SingleRedPacketAmountService (dto) 
}
}
