package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.SourceTypeDto;
import org.users.service.command.SourceTypeService;


@RestController(value="/update")
public class SourceTypeController{
    @Autowired
private SourceTypeService service;
@PostMapping(value=" entityFile ")
public  void  update(SourceTypeDto dto){
service.SourceType (dto); 
}
}
