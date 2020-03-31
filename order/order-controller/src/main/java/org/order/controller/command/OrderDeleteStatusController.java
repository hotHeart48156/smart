package  org.order.controller.command;

import org.order.dto.aggredto.OrderDeleteStatusDto;
import org.order.service.command.OrderDeleteStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderDeleteStatusController{
    @Autowired
private OrderDeleteStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderDeleteStatusDto dto){
service.OrderDeleteStatus (dto); 
}
}

