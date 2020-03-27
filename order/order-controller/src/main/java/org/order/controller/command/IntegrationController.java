package  org.order.controller.command;
@RestController(value="/update")
public class IntegrationController{
    @Autowired
private IntegrationService service;
@PostMapping(value=" entityFile ")
public  void  update(IntegrationDto  dto){
service.Integration (dto); 
}
}
