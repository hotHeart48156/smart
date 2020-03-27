package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.BirthdayDto;
import org.users.service.command.BirthdayService;


@RestController(value="/update")
public class BirthdayController{
    @Autowired
private BirthdayService service;
@PostMapping(value=" entityFile ")
public  void  update(BirthdayDto dto){
service.Birthday (dto); 
}
}
