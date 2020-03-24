package  org.activite.controller.update;
@RestController(value="/update")public class PromotionLogServiceController{
    @Autowired
private PromotionLogServiceService service;
@ApiOperation("updatePromotionLogService)
@PostMapping(value=" entityFile ")
public  void  update(PromotionLogServiceDto  dto){
service.PromotionLogService (dto) 
}
}
