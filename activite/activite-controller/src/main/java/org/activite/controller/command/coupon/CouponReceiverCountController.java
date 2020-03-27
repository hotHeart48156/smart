package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponReceiverCountController{
    @Autowired
private CouponReceiverCountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponReceiverCountDto  dto){
service.CouponReceiverCount (dto); 
}
}
