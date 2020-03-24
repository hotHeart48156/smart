package  org.activite.controller.update;
@RestController(value="/update")public class MarketingNameServiceController{
    @Autowired
private MarketingNameServiceService service;
@ApiOperation("updateMarketingNameService)
@PostMapping(value=" entityFile ")
public  void  update(MarketingNameServiceDto  dto){
service.MarketingNameService (dto) 
}
}
