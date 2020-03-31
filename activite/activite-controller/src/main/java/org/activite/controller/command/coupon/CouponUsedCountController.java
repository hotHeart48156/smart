package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.CouponUsedCountDto;
import org.activite.service.command.coupon.CouponUsedCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CouponUsedCountController{
    @Autowired
private CouponUsedCountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponUsedCountDto dto){
service.CouponUsedCount (dto); 
}
}
