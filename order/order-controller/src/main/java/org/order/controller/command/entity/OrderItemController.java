package org.order.controller.command.entity;

import io.swagger.annotations.ApiOperation;
import org.order.executor.command.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderItemController{
    @Autowired
private OrderItemService service;
@ApiOperation("updateOrderItem)
@PostMapping("/update/OrderItem/")
public  void  update(OrderItemDto  dto){
service.OrderItem (dto) 
}
}
