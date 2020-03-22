package  org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class OrderReturnReasonController{
    @Autowired
private OrderReturnReasonService service;
@ApiOperation("updateOrderReturnReason)
@PostMapping("/update/OrderReturnReason/")
public  void  update(OrderReturnReasonDto  dto){
service.OrderReturnReason (dto) 
}
}
