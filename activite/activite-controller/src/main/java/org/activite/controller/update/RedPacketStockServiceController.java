package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class RedPacketStockServiceController{
    @Autowired
private RedPacketStockServiceService service;
@ApiOperation("updateRedPacketStockService)
@PostMapping("/update/RedPacketStockService/")
public  void  update(RedPacketStockServiceDto  dto){
service.RedPacketStockService (dto) 
}
}
