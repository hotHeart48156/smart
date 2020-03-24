package  org.activite.controller.update;
@RestController(value="/update")public class SmallTypeServiceController{
    @Autowired
private SmallTypeServiceService service;
@ApiOperation("updateSmallTypeService)
@PostMapping(value=" entityFile ")
public  void  update(SmallTypeServiceDto  dto){
service.SmallTypeService (dto) 
}
}
