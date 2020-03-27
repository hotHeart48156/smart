package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.MemberLevelDto;
import org.users.service.command.MemberLevelService;


@RestController(value="/update")
public class MemberLevelController{
    @Autowired
private MemberLevelService service;
@PostMapping(value=" entityFile ")
public  void  update(MemberLevelDto  dto){
service.MemberLevel (dto); 
}
}
