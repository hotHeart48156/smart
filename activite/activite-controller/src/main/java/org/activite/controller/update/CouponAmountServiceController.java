package  org.activite.controller.update;
@RestController(value="/update")public class CouponAmountServiceController{
    @Autowired
private CouponAmountServiceService service;
@ApiOperation("updateCouponAmountService)
@PostMapping(value=" entityFile ")
public  void  update(CouponAmountServiceDto  dto){
service.CouponAmountService (dto) 
}
}
