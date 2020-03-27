package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class AppletSetController{
    @Autowired
private AppletSetService service;
@PostMapping(value="AppletSet") 
public  void  query(AppletSetDto  dto){
service.AppletSet (dto); 
}
}
