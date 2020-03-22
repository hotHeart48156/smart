package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class MemberLevelController{
    @Autowired
private MemberLevelService service;
@ApiOperation("updateMemberLevel)
@PostMapping("/update/MemberLevel/")
public  void  update(MemberLevelDto  dto){
service.MemberLevel (dto) 
}
}
