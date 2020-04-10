package  org.product.controller.command.entity;

import org.product.dto.entity.ProductSkuStockDto;
import org.product.service.command.entity.ProductSkuStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductSkuStockController{
    @Autowired
private ProductSkuStockService service;
@PostMapping(value=" productSkuStock")
public  void  update(ProductSkuStockDto  dto){
service.ProductSkuStock (dto); 
}
}
