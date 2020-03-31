package org.order.controller.query.entity;

import org.order.dto.entitydto.OrderOperateHistoryDto;
import org.order.service.command.OrderOperateHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/query/")
public class OrderOperateHistoryController{
    @Autowired
private OrderOperateHistoryService service;
@PostMapping(value="OrderOperateHistory")
public  void  query(OrderOperateHistoryDto dto){
service.OrderOperateHistory (dto); 
}
}

