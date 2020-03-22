package  org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class OrderAndOrderItemRelationshipController{
    @Autowired
private OrderAndOrderItemRelationshipService service;
@ApiOperation("updateOrderAndOrderItemRelationship)
@PostMapping("/update/OrderAndOrderItemRelationship/")
public  void  update(OrderAndOrderItemRelationshipDto  dto){
service.OrderAndOrderItemRelationship (dto) 
}
}
