package  org.order.controller.command;

import org.order.dto.aggredto.GrowthDto;
import org.order.service.command.GrowthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class GrowthController{
    @Autowired
private GrowthService service;
@PostMapping(value=" entityFile ")
public  void  update(GrowthDto dto){
service.Growth (dto); 
}
}

