package  org.activite.controller.update;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponCountServiceController{
    @Autowired
private CouponCountServiceService service;
@ApiOperation("updateCouponCountService)
@PostMapping("/update/CouponCountService/")
public  void  update(CouponCountServiceDto  dto){
service.CouponCountService (dto) 
}
}
