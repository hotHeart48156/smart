package  org.activite.controller.update;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

public class CouponTypeServiceController{
    @Autowired
private CouponTypeServiceService service;
@ApiOperation("updateCouponTypeService)
@PostMapping(value="/update/CouponTypeService/")
public  void  update(CouponTypeServiceDto  dto){
service.CouponTypeService (dto) 
}
@PostMapping(value = "")
}
