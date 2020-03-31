package  org.order.controller.command;

import org.order.dto.aggredto.DeleteStatusDto;
import org.order.service.command.DeleteStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class DeleteStatusController{
    @Autowired
private DeleteStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(DeleteStatusDto dto){
service.DeleteStatus (dto); 
}
}
