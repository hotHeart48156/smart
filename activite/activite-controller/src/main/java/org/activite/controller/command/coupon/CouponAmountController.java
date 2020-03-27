package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.CouponAmountDto;
import org.activite.service.command.coupon.CouponAmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CouponAmountController{
    @Autowired
private CouponAmountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponAmountDto dto){
service.CouponAmount (dto); 
}
}
