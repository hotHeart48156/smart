package  org.order.controller.command;

import org.order.dto.aggredto.PaymentTimeDto;
import org.order.service.command.PaymentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class PaymentTimeController{
    @Autowired
private PaymentTimeService service;
@PostMapping(value=" entityFile ")
public  void  update(PaymentTimeDto dto){
service.PaymentTime (dto); 
}
}

