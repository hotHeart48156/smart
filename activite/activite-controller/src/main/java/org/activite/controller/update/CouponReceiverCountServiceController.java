package  org.activite.controller.update;
@RestController(value="/update")public class CouponReceiverCountServiceController{
    @Autowired
private CouponReceiverCountServiceService service;
@ApiOperation("updateCouponReceiverCountService)
@PostMapping(value=" entityFile ")
public  void  update(CouponReceiverCountServiceDto  dto){
service.CouponReceiverCountService (dto) 
}
}
