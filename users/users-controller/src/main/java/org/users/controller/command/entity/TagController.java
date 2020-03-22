package  org.users.controller.command.entity;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.service.command.TagService;

public class TagController{
    @Autowired
private TagService service;
@ApiOperation("updateTag)
@PostMapping("/update/Tag/")
public  void  update(TagDto  dto){
service.Tag (dto) 
}
}
