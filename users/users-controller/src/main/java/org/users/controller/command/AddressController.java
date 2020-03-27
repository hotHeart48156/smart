package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.AddressDto;
import org.users.service.command.AddressService;


@RestController(value="/update")
public class AddressController{
    @Autowired
private AddressService service;
@PostMapping(value=" entityFile ")
public  void  update(AddressDto  dto){
service.Address (dto); 
}
}
