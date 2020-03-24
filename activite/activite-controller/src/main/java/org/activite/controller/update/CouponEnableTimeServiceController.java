package  org.activite.controller.update;
@RestController(value="/update")public class CouponEnableTimeServiceController{
    @Autowired
private CouponEnableTimeServiceService service;
@ApiOperation("updateCouponEnableTimeService)
@PostMapping(value=" entityFile ")
public  void  update(CouponEnableTimeServiceDto  dto){
service.CouponEnableTimeService (dto) 
}
}
