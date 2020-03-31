package  org.order.controller.command;

import org.order.dto.aggredto.IntegrationDto;
import org.order.service.command.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class IntegrationController{
    @Autowired
private IntegrationService service;
@PostMapping(value=" entityFile ")
public  void  update(IntegrationDto dto){
service.Integration (dto); 
}
}

