package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductAttributeValueController{
    @Autowired
private ProductAttributeValueService service;
@ApiOperation("updateProductAttributeValue)
@PostMapping("/update/ProductAttributeValue/")
public  void  update(ProductAttributeValueDto  dto){
service.ProductAttributeValue (dto) 
}
}
