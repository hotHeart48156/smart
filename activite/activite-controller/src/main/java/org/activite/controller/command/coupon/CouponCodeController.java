package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponCodeController{
    @Autowired
private CouponCodeService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponCodeDto  dto){
service.CouponCode (dto); 
}
}
