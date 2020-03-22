package org.order.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderOperateHistoryController{
    @Autowired
private OrderOperateHistoryService service;
@ApiOperation("updateOrderOperateHistory)
@PostMapping("/update/OrderOperateHistory/")
public  void  update(OrderOperateHistoryDto  dto){
service.OrderOperateHistory (dto) 
}
}
