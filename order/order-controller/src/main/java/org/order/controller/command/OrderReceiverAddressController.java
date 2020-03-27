package  org.order.controller.command;
@RestController(value="/update")
public class OrderReceiverAddressController{
    @Autowired
private OrderReceiverAddressService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderReceiverAddressDto  dto){
service.OrderReceiverAddress (dto); 
}
}
