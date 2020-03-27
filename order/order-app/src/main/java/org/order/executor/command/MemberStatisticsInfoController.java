package  org.order.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class MemberStatisticsInfoController{
    @Autowired
private MemberStatisticsInfoService service;
@PostMapping(value="MemberStatisticsInfo") 
public  void  query(MemberStatisticsInfoDto  dto){
service.MemberStatisticsInfo (dto); 
}
}
