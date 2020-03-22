package  org.order.controller.command.aggre;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class OrderController{
    @Autowired
private OrderService service;
@ApiOperation("updateOrder)
@PostMapping("/update/Order/")
public  void  update(OrderDto  dto){
service.Order (dto) 
}
}
