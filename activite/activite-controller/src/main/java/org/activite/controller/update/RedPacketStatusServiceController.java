package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketStatusServiceController{
    @Autowired
private RedPacketStatusServiceService service;
@ApiOperation("updateRedPacketStatusService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketStatusServiceDto  dto){
service.RedPacketStatusService (dto) 
}
}
