package  org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class OrderSettingController{
    @Autowired
private OrderSettingService service;
@ApiOperation("updateOrderSetting)
@PostMapping("/update/OrderSetting/")
public  void  update(OrderSettingDto  dto){
service.OrderSetting (dto) 
}
}
