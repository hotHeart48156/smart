package  org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class OrderItemController{
    @Autowired
private OrderItemService service;
@ApiOperation("updateOrderItem)
@PostMapping("/update/OrderItem/")
public  void  update(OrderItemDto  dto){
service.OrderItem (dto) 
}
}
