package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class GroupMemberServiceController{
    @Autowired
private GroupMemberServiceService service;
@ApiOperation("updateGroupMemberService)
@PostMapping("/update/GroupMemberService/")
public  void  update(GroupMemberServiceDto  dto){
service.GroupMemberService (dto) 
}
}
