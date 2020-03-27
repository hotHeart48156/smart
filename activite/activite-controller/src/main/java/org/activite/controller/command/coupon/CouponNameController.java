package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponNameController{
    @Autowired
private CouponNameService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponNameDto  dto){
service.CouponName (dto); 
}
}
