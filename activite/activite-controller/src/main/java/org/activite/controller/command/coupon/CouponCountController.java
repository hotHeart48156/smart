package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponCountController{
    @Autowired
private CouponCountService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponCountDto  dto){
service.CouponCount (dto); 
}
}
