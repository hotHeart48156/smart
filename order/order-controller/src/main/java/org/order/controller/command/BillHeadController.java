package  org.order.controller.command;

import org.order.dto.aggredto.BillHeadDto;
import org.order.service.command.BillHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class BillHeadController{
    @Autowired
private BillHeadService service;
@PostMapping(value=" entityFile ")
public  void  update(BillHeadDto dto){
service.BillHead (dto); 
}
}

