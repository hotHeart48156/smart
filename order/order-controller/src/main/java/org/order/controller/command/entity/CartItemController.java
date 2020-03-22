package org.order.controller.command.entity;

import io.swagger.annotations.ApiOperation;
import org.order.executor.command.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
public class CartItemController{
    @Autowired
private CartItemService service;
@ApiOperation("updateCartItem)
@PostMapping("/update/CartItem/")
public  void  update(CartItemDto  dto){
service.CartItem (dto) 
}
}
