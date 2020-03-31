package  org.order.controller.command;

import org.order.dto.aggredto.DeliveryTimeDto;
import org.order.service.command.DeliveryTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class DeliveryTimeController{
    @Autowired
private DeliveryTimeService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliveryTimeDto dto){
service.DeliveryTime (dto); 
}
}

