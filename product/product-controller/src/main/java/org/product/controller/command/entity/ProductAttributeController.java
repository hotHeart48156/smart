package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductAttributeController{
    @Autowired
private ProductAttributeService service;
@ApiOperation("updateProductAttribute)
@PostMapping("/update/ProductAttribute/")
public  void  update(ProductAttributeDto  dto){
service.ProductAttribute (dto) 
}
}
