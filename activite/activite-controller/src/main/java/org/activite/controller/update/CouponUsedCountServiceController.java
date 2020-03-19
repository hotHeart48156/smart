package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponUsedCountServiceController{
    @Autowired
private CouponUsedCountServiceService service;
@ApiOperation("updateCouponUsedCountService)
@PostMapping("/update/CouponUsedCountService/")
public  void  update(CouponUsedCountServiceDto  dto){
service.CouponUsedCountService (dto) 
}
}
