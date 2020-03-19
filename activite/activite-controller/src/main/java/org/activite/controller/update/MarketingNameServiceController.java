package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class MarketingNameServiceController{
    @Autowired
private MarketingNameServiceService service;
@ApiOperation("updateMarketingNameService)
@PostMapping("/update/MarketingNameService/")
public  void  update(MarketingNameServiceDto  dto){
service.MarketingNameService (dto) 
}
}
