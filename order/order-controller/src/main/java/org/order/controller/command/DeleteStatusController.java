package  org.order.controller.command;
@RestController(value="/update")
public class DeleteStatusController{
    @Autowired
private DeleteStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(DeleteStatusDto  dto){
service.DeleteStatus (dto); 
}
}
