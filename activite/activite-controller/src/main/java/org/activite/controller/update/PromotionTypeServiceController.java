package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class PromotionTypeServiceController{
    @Autowired
private PromotionTypeServiceService service;
@ApiOperation("updatePromotionTypeService)
@PostMapping("/update/PromotionTypeService/")
public  void  update(PromotionTypeServiceDto  dto){
service.PromotionTypeService (dto) 
}
}
