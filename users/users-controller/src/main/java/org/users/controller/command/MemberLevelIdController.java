package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.MemberLevelIdDto;
import org.users.service.command.MemberLevelIdService;


@RestController(value="/update")
public class MemberLevelIdController{
    @Autowired
private MemberLevelIdService service;
@PostMapping(value=" entityFile ")
public  void  update(MemberLevelIdDto dto){
service.MemberLevelId (dto); 
}
}
