package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class OrderAndOrderItemRelationshipController{
    @Autowired
private OrderAndOrderItemRelationshipService service;
@PostMapping(value="OrderAndOrderItemRelationship") 
public  void  query(OrderAndOrderItemRelationshipDto  dto){
service.OrderAndOrderItemRelationship (dto); 
}
}
