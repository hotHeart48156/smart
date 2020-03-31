package org.product.controller.query.entity;

import org.product.dto.entity.ProductAttributeDto;
import org.product.service.command.entity.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductAttributeController{
    @Autowired
private ProductAttributeService service;
@PostMapping(value="ProductAttribute") 
public  void  query(ProductAttributeDto  dto){
service.ProductAttribute (dto); 
}
}
