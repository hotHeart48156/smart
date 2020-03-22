package  org.users.service.command;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.dto.agg.BirthdayDto;
import org.users.executor.AbstractCommand;
import org.users.executor.command.aggre.BirthdayCommand;

import org.springframework.stereotype.Service;
@Service
public class BirthdayService{
@Autowired
private CommandGateway commandGateway;
public void Birthday(BirthdayDto dto){
AbstractCommand command=new BirthdayCommand(dto);
commandGateway.sendAndWait(command);
}
}