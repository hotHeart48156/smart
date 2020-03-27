package  org.product.controller.query.entity;

import org.springframework.beans.factory.annotation.Autowired;
@RestController("/query/")
public class OrderReturnApplyController{
    @Autowired
private OrderReturnApplyService service;
@PostMapping(value="OrderReturnApply") 
public  void  query(OrderReturnApplyDto  dto){
service.OrderReturnApply (dto); 
}
}
