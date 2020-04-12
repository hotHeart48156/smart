package com.smart.website.product;

import org.product.dto.entity.GiftsDto;
import org.product.service.command.entity.GiftsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GiftsController{
    @Autowired
private GiftsService service;
@PostMapping(value="/query/gifts")
public  void  query(GiftsDto dto){
service.Gifts (dto); 
}
}
