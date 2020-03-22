package org.order.controller.command.aggre;

import io.swagger.annotations.ApiOperation;
import org.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderController{
    @Autowired
private OrderService service;
@ApiOperation("updateOrder)
@PostMapping("/update/Order/")
public  void  update(OrderDto  dto){
service.Order (dto) 
}
}
