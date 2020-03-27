package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class GrowthChangeHistoryItemController{
    @Autowired
private GrowthChangeHistoryItemService service;
@PostMapping(value="GrowthChangeHistoryItem") 
public  void  query(GrowthChangeHistoryItemDto  dto){
service.GrowthChangeHistoryItem (dto); 
}
}
