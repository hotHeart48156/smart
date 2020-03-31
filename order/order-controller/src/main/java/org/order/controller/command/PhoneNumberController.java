package  org.order.controller.command;

import org.order.dto.aggredto.PhoneNumberDto;
import org.order.service.command.PhoneNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class PhoneNumberController{
    @Autowired
private PhoneNumberService service;
@PostMapping(value=" entityFile ")
public  void  update(PhoneNumberDto dto){
service.PhoneNumber (dto); 
}
}

