package org.order.controller.query.entity;

import org.order.dto.entitydto.OrderItemDto;
import org.order.service.command.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class OrderItemController{
    @Autowired
private OrderItemService service;
@PostMapping(value="OrderItem")
public  void  query(OrderItemDto dto){
service.OrderItem (dto); 
}
}

