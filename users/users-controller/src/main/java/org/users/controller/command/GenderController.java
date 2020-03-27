package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.GenderDto;
import org.users.service.command.GenderService;


@RestController(value="/update")
public class GenderController{
    @Autowired
private GenderService service;
@PostMapping(value=" entityFile ")
public  void  update(GenderDto dto){
service.Gender (dto); 
}
}
