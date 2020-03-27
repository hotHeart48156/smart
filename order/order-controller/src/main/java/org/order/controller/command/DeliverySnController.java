package  org.order.controller.command;
@RestController(value="/update")
public class DeliverySnController{
    @Autowired
private DeliverySnService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliverySnDto  dto){
service.DeliverySn (dto); 
}
}
