package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.GrowthChangeHistoryItemDto;
import org.users.service.command.GrowthChangeHistoryItemService;

@RestController("/query/")
public class GrowthChangeHistoryItemController{
    @Autowired
private GrowthChangeHistoryItemService service;
@PostMapping(value="GrowthChangeHistoryItem")
public  void  query(GrowthChangeHistoryItemDto dto){
service.GrowthChangeHistoryItem (dto); 
}
}
