package  org.order.controller.command;

import org.order.dto.entitydto.AddressDto;
import org.order.service.command.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class AddressController{
    @Autowired
private AddressService service;
@PostMapping(value=" entityFile ")
public  void  update(AddressDto dto){
service.Address (dto); 
}
}
