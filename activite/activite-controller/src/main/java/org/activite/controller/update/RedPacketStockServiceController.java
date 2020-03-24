package  org.activite.controller.update;
@RestController(value="/update")public class RedPacketStockServiceController{
    @Autowired
private RedPacketStockServiceService service;
@ApiOperation("updateRedPacketStockService)
@PostMapping(value=" entityFile ")
public  void  update(RedPacketStockServiceDto  dto){
service.RedPacketStockService (dto) 
}
}
