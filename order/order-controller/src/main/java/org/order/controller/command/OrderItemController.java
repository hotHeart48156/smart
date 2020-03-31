package  org.order.controller.command;

import org.order.dto.entitydto.OrderItemDto;
import org.order.service.command.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderItemController{
    @Autowired
private OrderItemService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderItemDto dto){
service.OrderItem (dto); 
}
}

