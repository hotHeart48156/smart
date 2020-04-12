package com.smart.website.product;

import org.product.dto.entity.GiftsCategoryDto;
import org.product.service.command.entity.GiftsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GiftsCategoryController{
    @Autowired
private GiftsCategoryService service;
@PostMapping(value="/query/giftsCategory")
public  void  query(GiftsCategoryDto dto){
service.GiftsCategory (dto); 
}
}
