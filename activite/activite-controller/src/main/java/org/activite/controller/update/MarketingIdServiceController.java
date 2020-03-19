package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class MarketingIdServiceController{
    @Autowired
private MarketingIdServiceService service;
@ApiOperation("updateMarketingIdService)
@PostMapping("/update/MarketingIdService/")
public  void  update(MarketingIdServiceDto  dto){
service.MarketingIdService (dto) 
}
}
