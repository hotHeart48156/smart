package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CouponMinPointServiceController{
    @Autowired
private CouponMinPointServiceService service;
@ApiOperation("updateCouponMinPointService)
@PostMapping("/update/CouponMinPointService/")
public  void  update(CouponMinPointServiceDto  dto){
service.CouponMinPointService (dto) 
}
}
