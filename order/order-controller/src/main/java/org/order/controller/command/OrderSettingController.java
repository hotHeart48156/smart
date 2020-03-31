package  org.order.controller.command;

import org.order.dto.entitydto.OrderSettingDto;
import org.order.service.command.OrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class OrderSettingController{
    @Autowired
private OrderSettingService service;
@PostMapping(value=" entityFile ")
public  void  update(OrderSettingDto dto){
service.OrderSetting (dto); 
}
}
