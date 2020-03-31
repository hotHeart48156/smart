package  org.order.controller.command;

import org.order.dto.aggredto.BillTypeDto;
import org.order.service.command.BillTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class BillTypeController{
    @Autowired
private BillTypeService service;
@PostMapping(value=" entityFile ")
public  void  update(BillTypeDto dto){
service.BillType (dto); 
}
}

