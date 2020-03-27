package  org.order.controller.command;
@RestController(value="/update")
public class OrderStatusController{
    @Autowired
private OrderStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderStatusDto  dto){
service.OrderStatus (dto); 
}
}
