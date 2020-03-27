package  org.order.controller.command;

import org.order.dto.AbstractDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class AbstractController{
    @Autowired
private AbstractService service;
@PostMapping(value=" entityFile ")
public  void  update(AbstractDto dto){
service.Abstract (dto); 
}
}
