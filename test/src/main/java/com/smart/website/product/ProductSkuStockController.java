package com.smart.website.product;

import org.product.dto.entity.ProductSkuStockDto;
import org.product.service.command.entity.ProductSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductSkuStockController{
    @Autowired
private ProductSkuStockService service;
@PostMapping(value="/query/productSkuStock")
public  void  query(ProductSkuStockDto  dto){
service.ProductSkuStock (dto); 
}
}
