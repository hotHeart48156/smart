package  org.activite.controller.update;
@RestController(value="/update")public class StartTimeServiceController{
    @Autowired
private StartTimeServiceService service;
@ApiOperation("updateStartTimeService)
@PostMapping(value=" entityFile ")
public  void  update(StartTimeServiceDto  dto){
service.StartTimeService (dto) 
}
}
