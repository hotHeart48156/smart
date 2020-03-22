package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class IntegrationChangeHistoryItemController{
    @Autowired
private IntegrationChangeHistoryItemService service;
@ApiOperation("updateIntegrationChangeHistoryItem)
@PostMapping("/update/IntegrationChangeHistoryItem/")
public  void  update(IntegrationChangeHistoryItemDto  dto){
service.IntegrationChangeHistoryItem (dto) 
}
}
