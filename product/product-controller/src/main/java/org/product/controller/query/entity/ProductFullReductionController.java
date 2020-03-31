package org.product.controller.query.entity;

import org.product.dto.entity.ProductFullReductionDto;
import org.product.service.command.entity.ProductFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductFullReductionController{
    @Autowired
private ProductFullReductionService service;
@PostMapping(value="ProductFullReduction") 
public  void  query(ProductFullReductionDto dto){
service.ProductFullReduction (dto); 
}
}
