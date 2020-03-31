package  org.order.controller.command;

import org.order.dto.aggredto.OrderReceiverAddressDto;
import org.order.service.command.OrderReceiverAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderReceiverAddressController{
    @Autowired
private OrderReceiverAddressService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderReceiverAddressDto dto){
service.OrderReceiverAddress (dto); 
}
}

