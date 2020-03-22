package org.order.controller.command.entity;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderAndOrderItemRelationshipController{
    @Autowired
private OrderAndOrderItemRelationshipService service;
@ApiOperation("updateOrderAndOrderItemRelationship)
@PostMapping("/update/OrderAndOrderItemRelationship/")
public  void  update(OrderAndOrderItemRelationshipDto  dto){
service.OrderAndOrderItemRelationship (dto) 
}
}
