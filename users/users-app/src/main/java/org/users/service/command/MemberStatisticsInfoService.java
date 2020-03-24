package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.entity.MemberStatisticsInfoDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.entity.MemberStatisticsInfoCommand;

import org.springframework.stereotype.Service;
@Service
public class MemberStatisticsInfoService{
@Autowired
private CommandGateway commandGateway;
public void MemberStatisticsInfo(MemberStatisticsInfoDto dto){
AbstractCommand command=new MemberStatisticsInfoCommand(dto);
commandGateway.sendAndWait(command);
}
}