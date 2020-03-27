package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.TagDto;
import org.users.service.command.TagService;


@RestController(value="/update")
public class TagController{
    @Autowired
private TagService service;
@PostMapping(value=" entityFile ")
public  void  update(TagDto  dto){
service.Tag (dto); 
}
}
