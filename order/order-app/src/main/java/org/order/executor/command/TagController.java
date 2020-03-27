package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class TagController{
    @Autowired
private TagService service;
@PostMapping(value="Tag") 
public  void  query(TagDto  dto){
service.Tag (dto); 
}
}
