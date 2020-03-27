package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.NickNameDto;
import org.users.service.command.NickNameService;


@RestController(value="/update")
public class NickNameController{
    @Autowired
private NickNameService service;
@PostMapping(value=" entityFile ")
public  void  update(NickNameDto dto){
service.NickName (dto); 
}
}
