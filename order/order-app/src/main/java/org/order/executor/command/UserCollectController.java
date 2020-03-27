package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class UserCollectController{
    @Autowired
private UserCollectService service;
@PostMapping(value="UserCollect") 
public  void  query(UserCollectDto  dto){
service.UserCollect (dto); 
}
}
