package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.executor.AbstractQuery;
import org.users.executor.command.aggre.BirthdayCommand;

import org.springframework.stereotype.Service;
@Service
public class BirthdayService{
@Autowired
private CommandGateway commandGateway;
public void Birthday(BirthdayDto dto){
AbstractQuery command=new BirthdayCommand(dto);
commandGateway.sendAndWait(command);
}
}