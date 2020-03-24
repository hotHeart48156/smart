package  org.activite.controller.update;
@RestController(value="/update")public class MarketStatusServiceController{
    @Autowired
private MarketStatusServiceService service;
@ApiOperation("updateMarketStatusService)
@PostMapping(value=" entityFile ")
public  void  update(MarketStatusServiceDto  dto){
service.MarketStatusService (dto) 
}
}
