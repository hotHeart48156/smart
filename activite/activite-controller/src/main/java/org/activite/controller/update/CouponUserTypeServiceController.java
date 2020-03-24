package  org.activite.controller.update;
@RestController(value="/update")public class CouponUserTypeServiceController{
    @Autowired
private CouponUserTypeServiceService service;
@ApiOperation("updateCouponUserTypeService)
@PostMapping(value=" entityFile ")
public  void  update(CouponUserTypeServiceDto  dto){
service.CouponUserTypeService (dto) 
}
}
