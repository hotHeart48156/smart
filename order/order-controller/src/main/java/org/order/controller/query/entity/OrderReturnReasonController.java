package org.order.controller.query.entity;

import org.order.dto.entitydto.OrderReturnReasonDto;
import org.order.service.command.OrderReturnReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class OrderReturnReasonController{
    @Autowired
private OrderReturnReasonService service;
@PostMapping(value="OrderReturnReason")
public  void  query(OrderReturnReasonDto dto){
service.OrderReturnReason (dto); 
}
}

