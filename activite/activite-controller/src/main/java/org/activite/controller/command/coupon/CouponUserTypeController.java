package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponUserTypeController{
    @Autowired
private CouponUserTypeService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponUserTypeDto  dto){
service.CouponUserType (dto); 
}
}
