package  org.activite.controller.update;
@RestController(value="/update")public class CouponTypeServiceController{
    @Autowired
private CouponTypeServiceService service;
@ApiOperation("updateCouponTypeService)
@PostMapping(value=" entityFile ")
public  void  update(CouponTypeServiceDto  dto){
service.CouponTypeService (dto) 
}
}
