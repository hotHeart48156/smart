package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponIdServiceController{
    @Autowired
private CouponIdServiceService service;
@ApiOperation("updateCouponIdService)
@PostMapping("/update/CouponIdService/")
public  void  update(CouponIdServiceDto  dto){
service.CouponIdService (dto) 
}
}
