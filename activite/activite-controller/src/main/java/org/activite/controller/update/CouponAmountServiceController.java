package  org.activite.controller.update;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
public class CouponAmountServiceController{
    @Autowired
private CouponAmountServiceService service;
@ApiOperation("updateCouponAmountService)
@PostMapping("/update/CouponAmountService/")
public  void  update(CouponAmountServiceDto  dto){
service.CouponAmountService (dto) 
}
}
