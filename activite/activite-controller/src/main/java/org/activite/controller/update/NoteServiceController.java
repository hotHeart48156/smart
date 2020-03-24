package  org.activite.controller.update;
@RestController(value="/update")public class NoteServiceController{
    @Autowired
private NoteServiceService service;
@ApiOperation("updateNoteService)
@PostMapping(value=" entityFile ")
public  void  update(NoteServiceDto  dto){
service.NoteService (dto) 
}
}
