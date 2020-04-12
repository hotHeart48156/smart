package com.smart.website.product;
import org.product.dto.entity.ProductAttributeCategoryDto;
import org.product.service.command.entity.ProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductAttributeCategoryController{
    @Autowired
private ProductAttributeCategoryService service;
@PostMapping(value="/query/productAttributeCategory")
public  void  query(ProductAttributeCategoryDto  dto){
service.ProductAttributeCategory (dto); 
}
}
