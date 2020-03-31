package org.product.controller.query.entity;

import org.product.dto.entity.MemberPriceDto;
import org.product.service.command.entity.MemberPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class MemberPriceController{
    @Autowired
private MemberPriceService service;
@PostMapping(value="MemberPrice") 
public  void  query(MemberPriceDto dto){
service.MemberPrice (dto); 
}
}
