package  org.activite.controller.update;
@RestController(value="/update")public class CouponMinPointServiceController{
    @Autowired
private CouponMinPointServiceService service;
@ApiOperation("updateCouponMinPointService)
@PostMapping(value=" entityFile ")
public  void  update(CouponMinPointServiceDto  dto){
service.CouponMinPointService (dto) 
}
}
