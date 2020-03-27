package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class OrderItemController{
    @Autowired
private OrderItemService service;
@PostMapping(value="OrderItem") 
public  void  query(OrderItemDto  dto){
service.OrderItem (dto); 
}
}
