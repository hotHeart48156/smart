package  org.order.controller.command;

import org.order.dto.aggredto.ConfirmStatusDto;
import org.order.service.command.ConfirmStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class ConfirmStatusController{
    @Autowired
private ConfirmStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(ConfirmStatusDto dto){
service.ConfirmStatus (dto); 
}
}
