package  org.order.controller.command;

import org.order.dto.aggredto.OrderStatusDto;
import org.order.service.command.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderStatusController{
    @Autowired
private OrderStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderStatusDto dto){
service.OrderStatus (dto); 
}
}

