package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponEnableTimeServiceController{
    @Autowired
private CouponEnableTimeServiceService service;
@ApiOperation("updateCouponEnableTimeService)
@PostMapping("/update/CouponEnableTimeService/")
public  void  update(CouponEnableTimeServiceDto  dto){
service.CouponEnableTimeService (dto) 
}
}
