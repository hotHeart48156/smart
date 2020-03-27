package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class CouponMinPointController{
    @Autowired
private CouponMinPointService service;
@PostMapping(value=" entityFile ")
public  void  update(CouponMinPointDto  dto){
service.CouponMinPoint (dto); 
}
}
