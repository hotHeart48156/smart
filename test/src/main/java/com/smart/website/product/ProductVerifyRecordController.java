package com.smart.website.product;

import org.product.dto.entity.ProductVerifyRecordDto;
import org.product.service.command.entity.ProductVerifyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductVerifyRecordController{
    @Autowired
private ProductVerifyRecordService service;
@PostMapping(value="/query/productVerifyRecord")
public  void  query(ProductVerifyRecordDto  dto){
service.ProductVerifyRecord (dto); 
}
}
