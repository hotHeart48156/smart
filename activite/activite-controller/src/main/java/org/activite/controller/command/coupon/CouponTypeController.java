package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponTypeController{
    @Autowired
private CouponTypeService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponTypeDto  dto){
service.CouponType (dto); 
}
}
