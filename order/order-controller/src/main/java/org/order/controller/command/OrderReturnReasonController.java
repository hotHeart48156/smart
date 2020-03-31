package  org.order.controller.command;

import org.order.dto.entitydto.OrderReturnReasonDto;
import org.order.service.command.OrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderReturnReasonController{
    @Autowired
private OrderReturnReasonService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderReturnReasonDto dto){
service.OrderReturnReason (dto); 
}
}

