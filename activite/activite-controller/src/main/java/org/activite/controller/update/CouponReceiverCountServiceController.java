package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponReceiverCountServiceController{
    @Autowired
private CouponReceiverCountServiceService service;
@ApiOperation("updateCouponReceiverCountService)
@PostMapping("/update/CouponReceiverCountService/")
public  void  update(CouponReceiverCountServiceDto  dto){
service.CouponReceiverCountService (dto) 
}
}
