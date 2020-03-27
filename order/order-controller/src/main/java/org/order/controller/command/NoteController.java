package  org.order.controller.command;
@RestController(value="/update")
public class NoteController{
    @Autowired
private NoteService service;
@PostMapping(value=" entityFile ")
public  void  update(NoteDto  dto){
service.Note (dto); 
}
}
