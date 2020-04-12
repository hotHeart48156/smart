package com.smart.website.product;

import org.product.dto.entity.ProductLadderDto;
import org.product.service.command.entity.ProductLadderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductLadderController{
    @Autowired
private ProductLadderService service;
@PostMapping(value="/query/productLadder")
public  void  query(ProductLadderDto dto){
service.ProductLadder (dto); 
}
}
