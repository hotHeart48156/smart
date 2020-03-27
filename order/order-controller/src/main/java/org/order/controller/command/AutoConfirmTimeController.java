package  org.order.controller.command;

import org.order.dto.aggredto.AutoConfirmTimeDto;
import org.order.service.command.AutoConfirmTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class AutoConfirmTimeController{
    @Autowired
private AutoConfirmTimeService service;
@PostMapping(value=" entityFile ")
public  void  update(AutoConfirmTimeDto dto){
service.AutoConfirmTime (dto); 
}
}
