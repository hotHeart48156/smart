package  org.activite.controller.command.coupon;
@RestController(value="/update")
public class PlatformController{
    @Autowired
private PlatformService service;
@PostMapping(value=" entityFile ")
public  void  update(PlatformDto  dto){
service.Platform (dto); 
}
}
