package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class GroupServiceController{
    @Autowired
private GroupServiceService service;
@ApiOperation("updateGroupService)
@PostMapping("/update/GroupService/")
public  void  update(GroupServiceDto  dto){
service.GroupService (dto) 
}
}
