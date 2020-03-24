package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketReceiveAmountServiceController{
    @Autowired
private RedPacketReceiveAmountServiceService service;
@ApiOperation("updateRedPacketReceiveAmountService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketReceiveAmountServiceDto  dto){
service.RedPacketReceiveAmountService (dto) 
}
}
