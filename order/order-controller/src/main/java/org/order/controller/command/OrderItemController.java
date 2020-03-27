package  org.order.controller.command;
@RestController(value="/update")
public class OrderItemController{
    @Autowired
private OrderItemService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderItemDto  dto){
service.OrderItem (dto); 
}
}
