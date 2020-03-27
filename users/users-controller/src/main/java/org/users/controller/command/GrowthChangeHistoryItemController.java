package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.GrowthChangeHistoryItemDto;
import org.users.service.command.GrowthChangeHistoryItemService;


@RestController(value="/update")
public class GrowthChangeHistoryItemController{
    @Autowired
private GrowthChangeHistoryItemService service;
@PostMapping(value=" entityFile ")
public  void  update(GrowthChangeHistoryItemDto  dto){
service.GrowthChangeHistoryItem (dto); 
}
}
