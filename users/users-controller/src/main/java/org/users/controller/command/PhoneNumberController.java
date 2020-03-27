package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.PhoneNumberDto;
import org.users.service.command.PhoneNumberService;


@RestController(value="/update")
public class PhoneNumberController{
    @Autowired
private PhoneNumberService service;
@PostMapping(value=" entityFile ")
public  void  update(PhoneNumberDto dto){
service.PhoneNumber (dto); 
}
}
