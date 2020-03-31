package org.order.controller.query.entity;

import org.order.dto.entitydto.OrderReturnApplyDto;
import org.order.service.command.OrderReturnApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class OrderReturnApplyController{
    @Autowired
private OrderReturnApplyService service;
@PostMapping(value="OrderReturnApply")
public  void  query(OrderReturnApplyDto dto){
service.OrderReturnApply (dto); 
}
}

