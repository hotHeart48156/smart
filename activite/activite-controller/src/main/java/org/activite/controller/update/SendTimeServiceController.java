package  org.activite.controller.update;
@RestController(value="/update")public class SendTimeServiceController{
    @Autowired
private SendTimeServiceService service;
@ApiOperation("updateSendTimeService)
@PostMapping(value=" entityFile ")
public  void  update(SendTimeServiceDto  dto){
service.SendTimeService (dto) 
}
}
