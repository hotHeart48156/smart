package  org.activite.controller.update;
@RestController(value="/update")public class CouponNameServiceController{
    @Autowired
private CouponNameServiceService service;
@ApiOperation("updateCouponNameService)
@PostMapping(value=" entityFile ")
public  void  update(CouponNameServiceDto  dto){
service.CouponNameService (dto) 
}
}
