package  org.users.controller.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.users.dto.agg.JobDto;
import org.users.service.command.JobService;


@RestController(value="/update")
public class JobController{
    @Autowired
private JobService service;
@PostMapping(value=" entityFile ")
public  void  update(JobDto dto){
service.Job (dto); 
}
}
