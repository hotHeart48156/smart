package  org.order.controller.command;
@RestController(value="/update")
public class AddBillMessageController{
    @Autowired
private AddBillMessageService service;
@PostMapping(value=" entityFile ")
public  void  update(AddBillMessageDto  dto){
service.AddBillMessage (dto); 
}
}
