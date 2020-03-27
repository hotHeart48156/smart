package  org.order.controller.command;
@RestController(value="/update")
public class PhoneNumberController{
    @Autowired
private PhoneNumberService service;
@PostMapping(value=" entityFile ")
public  void  update(PhoneNumberDto  dto){
service.PhoneNumber (dto); 
}
}
