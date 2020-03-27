package  org.order.controller.command;
@RestController(value="/update")
public class PaymentTimeController{
    @Autowired
private PaymentTimeService service;
@PostMapping(value=" entityFile ")
public  void  update(PaymentTimeDto  dto){
service.PaymentTime (dto); 
}
}
