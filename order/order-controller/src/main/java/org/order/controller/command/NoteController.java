package  org.order.controller.command;

import org.order.dto.aggredto.NoteDto;
import org.order.service.command.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class NoteController{
    @Autowired
private NoteService service;
@PostMapping(value=" entityFile ")
public  void  update(NoteDto dto){
service.Note (dto); 
}
}

