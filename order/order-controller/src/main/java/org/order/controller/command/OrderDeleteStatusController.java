package  org.order.controller.command;
@RestController(value="/update")
public class OrderDeleteStatusController{
    @Autowired
private OrderDeleteStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderDeleteStatusDto  dto){
service.OrderDeleteStatus (dto); 
}
}
