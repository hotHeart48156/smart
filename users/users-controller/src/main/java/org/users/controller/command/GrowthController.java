package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.GrowthDto;
import org.users.service.command.GrowthService;


@RestController(value="/update")
public class GrowthController{
    @Autowired
private GrowthService service;
@PostMapping(value=" entityFile ")
public  void  update(GrowthDto dto){
service.Growth (dto); 
}
}
