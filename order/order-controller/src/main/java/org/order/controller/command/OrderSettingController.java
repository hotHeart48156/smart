package  org.order.controller.command;
@RestController(value="/update")
public class OrderSettingController{
    @Autowired
private OrderSettingService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderSettingDto  dto){
service.OrderSetting (dto); 
}
}
