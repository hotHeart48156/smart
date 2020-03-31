package org.product.controller.query.entity;
import org.product.dto.entity.ProductConsultDto;
import org.product.service.command.entity.ProductConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductConsultController{
    @Autowired
private ProductConsultService service;
@PostMapping(value="ProductConsult") 
public  void  query(ProductConsultDto  dto){
service.ProductConsult (dto); 
}
}
