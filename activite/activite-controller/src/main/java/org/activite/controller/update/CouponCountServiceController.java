package  org.activite.controller.update;
@RestController(value="/update")public class CouponCountServiceController{
    @Autowired
private CouponCountServiceService service;
@ApiOperation("updateCouponCountService)
@PostMapping(value=" entityFile ")
public  void  update(CouponCountServiceDto  dto){
service.CouponCountService (dto) 
}
}
