package  org.activite.controller.update;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class NoteServiceController{
    @Autowired
private NoteServiceService service;
@ApiOperation("updateNoteService)
@PostMapping("/update/NoteService/")
public  void  update(NoteServiceDto  dto){
service.NoteService (dto) 
}
}
