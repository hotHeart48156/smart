package  org.order.controller.command;
@RestController(value="/update")
public class GrowthController{
    @Autowired
private GrowthService service;
@PostMapping(value=" entityFile ")
public  void  update(GrowthDto  dto){
service.Growth (dto); 
}
}
