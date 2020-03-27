package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.MemberStatisticsInfoDto;
import org.users.service.command.MemberStatisticsInfoService;


@RestController(value="/update")
public class MemberStatisticsInfoController{
    @Autowired
private MemberStatisticsInfoService service;
@PostMapping(value=" entityFile ")
public  void  update(MemberStatisticsInfoDto  dto){
service.MemberStatisticsInfo (dto); 
}
}
