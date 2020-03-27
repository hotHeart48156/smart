package  org.order.controller.command;
@RestController(value="/update")
public class ReceiverNameController{
    @Autowired
private ReceiverNameService service;
@PostMapping(value=" entityFile ")
public  void  update(ReceiverNameDto  dto){
service.ReceiverName (dto); 
}
}
