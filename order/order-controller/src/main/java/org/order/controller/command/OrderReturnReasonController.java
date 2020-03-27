package  org.order.controller.command;
@RestController(value="/update")
public class OrderReturnReasonController{
    @Autowired
private OrderReturnReasonService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderReturnReasonDto  dto){
service.OrderReturnReason (dto); 
}
}
