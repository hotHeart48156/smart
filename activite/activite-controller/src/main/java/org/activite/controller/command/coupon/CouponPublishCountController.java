package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.CouponPublishCountDto;
import org.activite.service.command.coupon.CouponPublishCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CouponPublishCountController{
    @Autowired
private CouponPublishCountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponPublishCountDto dto){
service.CouponPublishCount (dto); 
}
}
