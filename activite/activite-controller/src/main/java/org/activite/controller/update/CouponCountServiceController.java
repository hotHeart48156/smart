package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponCountServiceController{
    @Autowired
private CouponCountServiceService service;
@ApiOperation("updateCouponCountService)
@PostMapping("/update/CouponCountService/")
public  void  update(CouponCountServiceDto  dto){
service.CouponCountService (dto) 
}
}
