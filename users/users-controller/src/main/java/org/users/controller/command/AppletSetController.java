package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.AppletSetDto;
import org.users.service.command.AppletSetService;


@RestController(value="/update")
public class AppletSetController{
    @Autowired
private AppletSetService service;
@PostMapping(value=" entityFile ")
public  void  update(AppletSetDto dto){
service.AppletSet (dto); 
}
}
