package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketIdServiceController{
    @Autowired
private RedPacketIdServiceService service;
@ApiOperation("updateRedPacketIdService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketIdServiceDto  dto){
service.RedPacketIdService (dto) 
}
}
