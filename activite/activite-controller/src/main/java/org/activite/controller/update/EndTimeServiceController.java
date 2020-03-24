package  org.activite.controller.update;
@RestController(value="/update")public class EndTimeServiceController{
    @Autowired
private EndTimeServiceService service;
@ApiOperation("updateEndTimeService)
@PostMapping(value=" entityFile ")
public  void  update(EndTimeServiceDto  dto){
service.EndTimeService (dto) 
}
}
