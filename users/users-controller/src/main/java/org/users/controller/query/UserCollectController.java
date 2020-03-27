package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.UserCollectDto;
import org.users.service.command.UserCollectService;

@RestController("/query/")
public class UserCollectController{
    @Autowired
private UserCollectService service;
@PostMapping(value="UserCollect")
public  void  query(UserCollectDto dto){
service.UserCollect (dto); 
}
}
