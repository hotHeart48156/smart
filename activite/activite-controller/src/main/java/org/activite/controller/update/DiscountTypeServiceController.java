package  org.activite.controller.update;
@RestController(value="/update")public class DiscountTypeServiceController{
    @Autowired
private DiscountTypeServiceService service;
@ApiOperation("updateDiscountTypeService)
@PostMapping(value=" entityFile ")
public  void  update(DiscountTypeServiceDto  dto){
service.DiscountTypeService (dto) 
}
}
