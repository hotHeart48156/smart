package  org.order.controller.command;

import org.order.dto.entitydto.OrderOperateHistoryDto;
import org.order.service.command.OrderOperateHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderOperateHistoryController{
    @Autowired
private OrderOperateHistoryService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderOperateHistoryDto dto){
service.OrderOperateHistory (dto); 
}
}

