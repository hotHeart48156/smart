package  org.order.controller.command;
@RestController(value="/update")
public class DeliveryTimeController{
    @Autowired
private DeliveryTimeService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliveryTimeDto  dto){
service.DeliveryTime (dto); 
}
}
