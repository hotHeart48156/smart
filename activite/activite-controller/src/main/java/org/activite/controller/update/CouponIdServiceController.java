package  org.activite.controller.update;
@RestController(value="/update")public class CouponIdServiceController{
    @Autowired
private CouponIdServiceService service;
@ApiOperation("updateCouponIdService)
@PostMapping(value=" entityFile ")
public  void  update(CouponIdServiceDto  dto){
service.CouponIdService (dto) 
}
}
