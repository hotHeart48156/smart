package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.CouponReceiverCountDto;
import org.activite.service.command.coupon.CouponReceiverCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CouponReceiverCountController{
    @Autowired
private CouponReceiverCountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponReceiverCountDto dto){
service.CouponReceiverCount (dto); 
}
}
