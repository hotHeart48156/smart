package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.JobCommand;

import org.springframework.stereotype.Service;
@Service
public class JobService{
@Autowired
private CommandGateway commandGateway;
public void Job(JobDto dto){
AbstractQuery command=new JobCommand(dto);
commandGateway.sendAndWait(command);
}
}