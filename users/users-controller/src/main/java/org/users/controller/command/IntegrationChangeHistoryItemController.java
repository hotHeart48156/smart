package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.IntegrationChangeHistoryItemDto;
import org.users.service.command.IntegrationChangeHistoryItemService;


@RestController(value="/update")
public class IntegrationChangeHistoryItemController{
    @Autowired
private IntegrationChangeHistoryItemService service;
@PostMapping(value=" entityFile ")
public  void  update(IntegrationChangeHistoryItemDto  dto){
service.IntegrationChangeHistoryItem (dto); 
}
}
