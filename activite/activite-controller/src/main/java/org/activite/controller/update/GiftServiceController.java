package  org.activite.controller.update;
@RestController(value="/update")public class GiftServiceController{
    @Autowired
private GiftServiceService service;
@ApiOperation("updateGiftService)
@PostMapping(value=" entityFile ")
public  void  update(GiftServiceDto  dto){
service.GiftService (dto) 
}
}
