package com.smart.website.product;
import org.product.dto.entity.ProductConsultDto;
import org.product.service.command.entity.ProductConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductConsultController{
    @Autowired
private ProductConsultService service;
@PostMapping(value="/query/productConsult")
public  void  query(ProductConsultDto  dto){
service.ProductConsult (dto); 
}
}
