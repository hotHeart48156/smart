package  org.users.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class MemberStatisticsInfoController{
    @Autowired
private MemberStatisticsInfoService service;
@ApiOperation("updateMemberStatisticsInfo)
@PostMapping("/update/MemberStatisticsInfo/")
public  void  update(MemberStatisticsInfoDto  dto){
service.MemberStatisticsInfo (dto) 
}
}