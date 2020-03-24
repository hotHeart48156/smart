package  org.activite.controller.update;
@RestController(value="/update")public class SingleRedPacketAmountServiceController{
    @Autowired
private SingleRedPacketAmountServiceService service;
@ApiOperation("updateSingleRedPacketAmountService)
@PostMapping(value=" entityFile ")
public  void  update(SingleRedPacketAmountServiceDto  dto){
service.SingleRedPacketAmountService (dto) 
}
}
