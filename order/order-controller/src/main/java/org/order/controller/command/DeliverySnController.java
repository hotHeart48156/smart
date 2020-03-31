package  org.order.controller.command;

import org.order.dto.aggredto.DeliverySnDto;
import org.order.service.command.DeliverySnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class DeliverySnController{
    @Autowired
private DeliverySnService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliverySnDto dto){
service.DeliverySn (dto); 
}
}

