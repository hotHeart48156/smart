package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class MarketStatusServiceController{
    @Autowired
private MarketStatusServiceService service;
@ApiOperation("updateMarketStatusService)
@PostMapping("/update/MarketStatusService/")
public  void  update(MarketStatusServiceDto  dto){
service.MarketStatusService (dto) 
}
}
