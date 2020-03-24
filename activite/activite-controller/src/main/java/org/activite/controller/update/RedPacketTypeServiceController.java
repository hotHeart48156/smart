package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketTypeServiceController{
    @Autowired
private RedPacketTypeServiceService service;
@ApiOperation("updateRedPacketTypeService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketTypeServiceDto  dto){
service.RedPacketTypeService (dto) 
}
}
