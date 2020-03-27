package  org.product.controller.query.entity;

import org.order.dto.entitydto.OrderSettingDto;
import org.order.service.command.OrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class OrderSettingController{
    @Autowired
private OrderSettingService service;
@PostMapping(value="OrderSetting")
public  void  query(OrderSettingDto dto){
service.OrderSetting (dto); 
}
}
