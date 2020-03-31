package  org.order.controller.command;

import org.order.dto.entitydto.CompanyAddressDto;
import org.order.service.command.CompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class CompanyAddressController{
    @Autowired
private CompanyAddressService service;
@PostMapping(value=" entityFile ")
public  void  update(CompanyAddressDto dto){
service.CompanyAddress (dto); 
}
}

