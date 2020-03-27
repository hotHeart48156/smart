package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class MemberLevelController{
    @Autowired
private MemberLevelService service;
@PostMapping(value="MemberLevel") 
public  void  query(MemberLevelDto  dto){
service.MemberLevel (dto); 
}
}
