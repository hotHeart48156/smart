package  org.order.controller.command;
@RestController(value="/update")
public class DeliveryCompanyNameController{
    @Autowired
private DeliveryCompanyNameService service;
@PostMapping(value=" entityFile ")
public  void  update(DeliveryCompanyNameDto  dto){
service.DeliveryCompanyName (dto); 
}
}
