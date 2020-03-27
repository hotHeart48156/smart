package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.IntegrationChangeHistoryItemDto;
import org.users.service.command.IntegrationChangeHistoryItemService;

@RestController("/query/")
public class IntegrationChangeHistoryItemController{
    @Autowired
private IntegrationChangeHistoryItemService service;
@PostMapping(value="IntegrationChangeHistoryItem")
public  void  query(IntegrationChangeHistoryItemDto dto){
service.IntegrationChangeHistoryItem (dto); 
}
}
