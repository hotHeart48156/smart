package org.activite.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.activite.dto.agg.coupon.CouponCodeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author yangbiao
 */
@RestController
@Slf4j
public class CouponController {
    @Autowired
    private CouponCodeService couponCodeService;

@PostMapping("/update/createCoupon")
@ApiOperation("cadc")
   public void create(CouponCodeDto dto){
    couponCodeService.CouponCode(dto);
}
}
