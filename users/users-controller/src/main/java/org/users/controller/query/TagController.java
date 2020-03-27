package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.TagDto;
import org.users.service.command.TagService;

@RestController("/query/")
public class TagController{
    @Autowired
private TagService service;
@PostMapping(value="Tag")
public  void  query(TagDto dto){
service.Tag (dto); 
}
}
