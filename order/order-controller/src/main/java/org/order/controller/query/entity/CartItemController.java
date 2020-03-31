package org.order.controller.query.entity;

import org.order.dto.entitydto.CartItemDto;
import org.order.service.command.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class CartItemController{
    @Autowired
private CartItemService service;
@PostMapping(value="CartItem")
public  void  query(CartItemDto dto){
service.CartItem (dto); 
}
}

