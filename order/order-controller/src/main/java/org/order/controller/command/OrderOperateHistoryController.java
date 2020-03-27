package  org.order.controller.command;
@RestController(value="/update")
public class OrderOperateHistoryController{
    @Autowired
private OrderOperateHistoryService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderOperateHistoryDto  dto){
service.OrderOperateHistory (dto); 
}
}
