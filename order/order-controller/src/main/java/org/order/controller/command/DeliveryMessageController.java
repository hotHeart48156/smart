package  org.order.controller.command;

import org.order.dto.aggredto.DeliveryMessageDto;
import org.order.service.command.DeliveryMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class DeliveryMessageController{
    @Autowired
private DeliveryMessageService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliveryMessageDto dto){
service.DeliveryMessage (dto); 
}
}

