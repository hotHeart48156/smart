package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketAmountServiceController{
    @Autowired
private RedPacketAmountServiceService service;
@ApiOperation("updateRedPacketAmountService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketAmountServiceDto  dto){
service.RedPacketAmountService (dto) 
}
}
