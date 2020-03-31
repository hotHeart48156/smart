package  org.order.controller.command;

import org.order.dto.aggredto.AddBillMessageDto;
import org.order.service.command.AddBillMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class AddBillMessageController{
    @Autowired
private AddBillMessageService service;
@PostMapping(value=" entityFile ")
public  void  update(AddBillMessageDto dto){
service.AddBillMessage (dto); 
}
}

