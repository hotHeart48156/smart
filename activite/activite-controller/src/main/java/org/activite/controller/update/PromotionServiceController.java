package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class PromotionServiceController{
    @Autowired
private PromotionServiceService service;
@ApiOperation("updatePromotionService)
@PostMapping("/update/PromotionService/")
public  void  update(PromotionServiceDto  dto){
service.PromotionService (dto) 
}
}
