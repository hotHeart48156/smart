package  org.order.controller.command;

import org.order.dto.entitydto.OrderReturnApplyDto;
import org.order.service.command.OrderReturnApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderReturnApplyController{
    @Autowired
private OrderReturnApplyService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderReturnApplyDto dto){
service.OrderReturnApply (dto); 
}
}

