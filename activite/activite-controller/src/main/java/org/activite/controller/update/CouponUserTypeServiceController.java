package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponUserTypeServiceController{
    @Autowired
private CouponUserTypeServiceService service;
@ApiOperation("updateCouponUserTypeService)
@PostMapping("/update/CouponUserTypeService/")
public  void  update(CouponUserTypeServiceDto  dto){
service.CouponUserTypeService (dto) 
}
}
