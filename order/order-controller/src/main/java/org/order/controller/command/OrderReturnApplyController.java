package  org.order.controller.command;
@RestController(value="/update")
public class OrderReturnApplyController{
    @Autowired
private OrderReturnApplyService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderReturnApplyDto  dto){
service.OrderReturnApply (dto); 
}
}
