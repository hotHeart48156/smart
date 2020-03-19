package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class DiscountTypeServiceController{
    @Autowired
private DiscountTypeServiceService service;
@ApiOperation("updateDiscountTypeService)
@PostMapping("/update/DiscountTypeService/")
public  void  update(DiscountTypeServiceDto  dto){
service.DiscountTypeService (dto) 
}
}
