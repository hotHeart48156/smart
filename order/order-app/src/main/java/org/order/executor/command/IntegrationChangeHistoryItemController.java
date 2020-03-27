package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class IntegrationChangeHistoryItemController{
    @Autowired
private IntegrationChangeHistoryItemService service;
@PostMapping(value="IntegrationChangeHistoryItem") 
public  void  query(IntegrationChangeHistoryItemDto  dto){
service.IntegrationChangeHistoryItem (dto); 
}
}
