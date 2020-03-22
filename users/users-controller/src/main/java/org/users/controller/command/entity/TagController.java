package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class TagController{
    @Autowired
private TagService service;
@ApiOperation("updateTag)
@PostMapping("/update/Tag/")
public  void  update(TagDto  dto){
service.Tag (dto) 
}
}
