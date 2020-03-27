package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.AddressDto;
import org.users.service.command.AddressService;

@RestController("/query/")
public class AddressController{
    @Autowired
private AddressService service;
@PostMapping(value="Address")
public  void  query(AddressDto dto){
service.Address (dto); 
}
}
