package  org.activite.controller.update;
@RestController(value="/update")public class CouponUsedCountServiceController{
    @Autowired
private CouponUsedCountServiceService service;
@ApiOperation("updateCouponUsedCountService)
@PostMapping(value=" entityFile ")
public  void  update(CouponUsedCountServiceDto  dto){
service.CouponUsedCountService (dto) 
}
}
