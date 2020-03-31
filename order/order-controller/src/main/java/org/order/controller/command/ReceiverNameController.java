package  org.order.controller.command;

import org.order.dto.aggredto.ReceiverNameDto;
import org.order.service.command.ReceiverNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class ReceiverNameController{
    @Autowired
private ReceiverNameService service;
@PostMapping(value=" entityFile ")
public  void  update(ReceiverNameDto dto){
service.ReceiverName (dto); 
}
}

