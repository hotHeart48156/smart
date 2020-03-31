package  org.order.controller.command;

import org.order.dto.OrderCreateDto;
import org.order.service.command.OrderCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderCreateController{
    @Autowired
private OrderCreateService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderCreateDto  dto){
service.OrderCreate (dto); 
}

}


