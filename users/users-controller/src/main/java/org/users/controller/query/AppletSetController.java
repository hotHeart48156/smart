package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.AppletSetDto;
import org.users.service.command.AppletSetService;

@RestController("/query/")
public class AppletSetController{
    @Autowired
private AppletSetService service;
@PostMapping(value="AppletSet")
public  void  query(AppletSetDto dto){
service.AppletSet (dto); 
}
}
