package  org.activite.controller.update;
@RestController(value="/update")public class CouponHistoryServiceController{
    @Autowired
private CouponHistoryServiceService service;
@ApiOperation("updateCouponHistoryService)
@PostMapping(value=" entityFile ")
public  void  update(CouponHistoryServiceDto  dto){
service.CouponHistoryService (dto) 
}
}
