package  org.activite.controller.update;
@RestController(value="/update")public class CouponPublishCountServiceController{
    @Autowired
private CouponPublishCountServiceService service;
@ApiOperation("updateCouponPublishCountService)
@PostMapping(value=" entityFile ")
public  void  update(CouponPublishCountServiceDto  dto){
service.CouponPublishCountService (dto) 
}
}
