package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class GrowthChangeHistoryItemController{
    @Autowired
private GrowthChangeHistoryItemService service;
@ApiOperation("updateGrowthChangeHistoryItem)
@PostMapping("/update/GrowthChangeHistoryItem/")
public  void  update(GrowthChangeHistoryItemDto  dto){
service.GrowthChangeHistoryItem (dto) 
}
}
