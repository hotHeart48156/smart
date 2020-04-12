package com.smart.website.product;

import org.product.dto.entity.ProductFullReductionDto;
import org.product.service.command.entity.ProductFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductFullReductionController{
    @Autowired
private ProductFullReductionService service;
@PostMapping(value="/query/productFullReduction")
public  void  query(ProductFullReductionDto dto){
service.ProductFullReduction (dto); 
}
}
