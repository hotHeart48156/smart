package  org.order.controller.command;
@RestController(value="/update")
public class OrderCreateController{
    @Autowired
private OrderCreateService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderCreateDto  dto){
service.OrderCreate (dto); 
}
}
