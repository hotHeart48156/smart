package  org.activite.controller.update;
@RestController(value="/update")public class PlatformServiceController{
    @Autowired
private PlatformServiceService service;
@ApiOperation("updatePlatformService)
@PostMapping(value=" entityFile ")
public  void  update(PlatformServiceDto  dto){
service.PlatformService (dto) 
}
}
