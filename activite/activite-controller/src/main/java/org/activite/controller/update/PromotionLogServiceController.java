package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class PromotionLogServiceController{
    @Autowired
private PromotionLogServiceService service;
@ApiOperation("updatePromotionLogService)
@PostMapping("/update/PromotionLogService/")
public  void  update(PromotionLogServiceDto  dto){
service.PromotionLogService (dto) 
}
}
