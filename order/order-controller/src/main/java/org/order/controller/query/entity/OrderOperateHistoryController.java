package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class OrderOperateHistoryController{
    @Autowired
private OrderOperateHistoryService service;
@PostMapping(value="OrderOperateHistory") 
public  void  query(OrderOperateHistoryDto  dto){
service.OrderOperateHistory (dto); 
}
}
