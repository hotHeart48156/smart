package  org.order.controller.command;
@RestController(value="/update")
public class DeliveryMessageController{
    @Autowired
private DeliveryMessageService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliveryMessageDto  dto){
service.DeliveryMessage (dto); 
}
}
