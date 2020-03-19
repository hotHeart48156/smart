package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponCodeServiceController{
    @Autowired
private CouponCodeServiceService service;
@ApiOperation("updateCouponCodeService)
@PostMapping("/update/CouponCodeService/")
public  void  update(CouponCodeServiceDto  dto){
service.CouponCodeService (dto) 
}
}
