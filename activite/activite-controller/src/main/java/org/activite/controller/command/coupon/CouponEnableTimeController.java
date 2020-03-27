package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponEnableTimeController{
    @Autowired
private CouponEnableTimeService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponEnableTimeDto  dto){
service.CouponEnableTime (dto); 
}
}
