package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class CartItemController{
    @Autowired
private CartItemService service;
@PostMapping(value="CartItem") 
public  void  query(CartItemDto  dto){
service.CartItem (dto); 
}
}
