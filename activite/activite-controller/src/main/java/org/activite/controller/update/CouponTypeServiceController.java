package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponTypeServiceController{
    @Autowired
private CouponTypeServiceService service;
@ApiOperation("updateCouponTypeService)
@PostMapping("/update/CouponTypeService/")
public  void  update(CouponTypeServiceDto  dto){
service.CouponTypeService (dto) 
}
}
