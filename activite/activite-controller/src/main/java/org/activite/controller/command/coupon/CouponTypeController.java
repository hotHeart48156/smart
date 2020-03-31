package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.CouponTypeDto;
import org.activite.service.command.coupon.CouponTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CouponTypeController{
    @Autowired
private CouponTypeService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponTypeDto dto){
service.CouponType (dto); 
}
}
