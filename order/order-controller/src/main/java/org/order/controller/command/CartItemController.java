package  org.order.controller.command;

import org.order.dto.entitydto.CartItemDto;
import org.order.service.command.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CartItemController{
    @Autowired
private CartItemService service;
@PostMapping(value=" entityFile ")
public  void  update(CartItemDto dto){
service.CartItem (dto); 
}
}

