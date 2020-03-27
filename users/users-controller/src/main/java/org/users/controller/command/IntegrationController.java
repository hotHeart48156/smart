package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.IntegrationDto;
import org.users.service.command.IntegrationService;


@RestController(value="/update")
public class IntegrationController{
    @Autowired
private IntegrationService service;
@PostMapping(value=" entityFile ")
public  void  update(IntegrationDto dto){
service.Integration (dto); 
}
}
