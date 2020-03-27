package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponUsedCountController{
    @Autowired
private CouponUsedCountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponUsedCountDto  dto){
service.CouponUsedCount (dto); 
}
}
