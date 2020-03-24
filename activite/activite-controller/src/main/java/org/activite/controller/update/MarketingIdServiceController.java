package  org.activite.controller.update;
@RestController(value="/update")public class MarketingIdServiceController{
    @Autowired
private MarketingIdServiceService service;
@ApiOperation("updateMarketingIdService)
@PostMapping(value=" entityFile ")
public  void  update(MarketingIdServiceDto  dto){
service.MarketingIdService (dto) 
}
}
