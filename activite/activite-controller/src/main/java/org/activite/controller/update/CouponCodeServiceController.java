package  org.activite.controller.update;
@RestController(value="/update")public class CouponCodeServiceController{
    @Autowired
private CouponCodeServiceService service;
@ApiOperation("updateCouponCodeService)
@PostMapping(value=" entityFile ")
public  void  update(CouponCodeServiceDto  dto){
service.CouponCodeService (dto) 
}
}
