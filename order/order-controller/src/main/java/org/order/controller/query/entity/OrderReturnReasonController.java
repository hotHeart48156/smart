package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class OrderReturnReasonController{
    @Autowired
private OrderReturnReasonService service;
@PostMapping(value="OrderReturnReason") 
public  void  query(OrderReturnReasonDto  dto){
service.OrderReturnReason (dto); 
}
}
