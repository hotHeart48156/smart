package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.MemberLevelDto;
import org.users.service.command.MemberLevelService;

@RestController("/query/")
public class MemberLevelController{
    @Autowired
private MemberLevelService service;
@PostMapping(value="MemberLevel")
public  void  query(MemberLevelDto dto){
service.MemberLevel (dto); 
}
}
