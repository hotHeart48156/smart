package  org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class OrderReturnApplyController{
    @Autowired
private OrderReturnApplyService service;
@ApiOperation("updateOrderReturnApply)
@PostMapping("/update/OrderReturnApply/")
public  void  update(OrderReturnApplyDto  dto){
service.OrderReturnApply (dto) 
}
}
