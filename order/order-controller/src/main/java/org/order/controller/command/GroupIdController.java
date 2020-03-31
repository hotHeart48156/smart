package  org.order.controller.command;

import org.order.dto.aggredto.GroupIdDto;
import org.order.service.command.GroupIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class GroupIdController{
    @Autowired
private GroupIdService service;
@PostMapping(value=" entityFile ")
public  void  update(GroupIdDto dto){
service.GroupId (dto); 
}
}

