package  org.activite.controller.update;
@RestController(value="/update")public class PromotionTypeServiceController{
    @Autowired
private PromotionTypeServiceService service;
@ApiOperation("updatePromotionTypeService)
@PostMapping(value=" entityFile ")
public  void  update(PromotionTypeServiceDto  dto){
service.PromotionTypeService (dto) 
}
}
