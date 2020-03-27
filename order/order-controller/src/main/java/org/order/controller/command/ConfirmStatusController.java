package  org.order.controller.command;
@RestController(value="/update")
public class ConfirmStatusController{
    @Autowired
private ConfirmStatusService service;
@PostMapping(value=" entityFile ")
public  void  update(ConfirmStatusDto  dto){
service.ConfirmStatus (dto); 
}
}
