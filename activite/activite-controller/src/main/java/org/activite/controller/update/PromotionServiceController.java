package  org.activite.controller.update;
@RestController(value="/update")public class PromotionServiceController{
    @Autowired
private PromotionServiceService service;
@ApiOperation("updatePromotionService)
@PostMapping(value=" entityFile ")
public  void  update(PromotionServiceDto  dto){
service.PromotionService (dto) 
}
}
