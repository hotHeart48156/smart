package  org.users.controller.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.entity.MemberStatisticsInfoDto;
import org.users.service.command.MemberStatisticsInfoService;

@RestController("/query/")
public class MemberStatisticsInfoController{
    @Autowired
private MemberStatisticsInfoService service;
@PostMapping(value="MemberStatisticsInfo")
public  void  query(MemberStatisticsInfoDto dto){
service.MemberStatisticsInfo (dto); 
}
}
