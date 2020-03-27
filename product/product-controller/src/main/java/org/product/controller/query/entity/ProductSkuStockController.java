package  org.product.controller.query.entity;

import org.product.dto.entity.ProductSkuStockDto;
import org.product.service.command.entity.ProductSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductSkuStockController{
    @Autowired
private ProductSkuStockService service;
@PostMapping(value="ProductSkuStock") 
public  void  query(ProductSkuStockDto  dto){
service.ProductSkuStock (dto); 
}
}
