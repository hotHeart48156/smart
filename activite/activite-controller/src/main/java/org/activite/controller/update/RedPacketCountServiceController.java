package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketCountServiceController{
    @Autowired
private RedPacketCountServiceService service;
@ApiOperation("updateRedPacketCountService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketCountServiceDto  dto){
service.RedPacketCountService (dto) 
}
}
