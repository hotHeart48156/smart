package  org.order.controller.command;

import org.order.dto.aggredto.DeliveryCompanyNameDto;
import org.order.service.command.DeliveryCompanyNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class DeliveryCompanyNameController{
    @Autowired
private DeliveryCompanyNameService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliveryCompanyNameDto dto){
service.DeliveryCompanyName (dto); 
}
}
