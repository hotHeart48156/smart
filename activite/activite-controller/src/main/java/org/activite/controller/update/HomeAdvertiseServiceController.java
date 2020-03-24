package  org.activite.controller.update;
@RestController(value="/update")public class HomeAdvertiseServiceController{
    @Autowired
private HomeAdvertiseServiceService service;
@ApiOperation("updateHomeAdvertiseService)
@PostMapping(value=" entityFile ")
public  void  update(HomeAdvertiseServiceDto  dto){
service.HomeAdvertiseService (dto) 
}
}
