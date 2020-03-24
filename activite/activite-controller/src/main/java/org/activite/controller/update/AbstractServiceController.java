package  org.activite.controller.update;
@RestController(value="/update")public class AbstractServiceController{
    @Autowired
private AbstractServiceService service;
@ApiOperation("updateAbstractService)
@PostMapping(value=" entityFile ")
public  void  update(AbstractServiceDto  dto){
service.AbstractService (dto) 
}
}
