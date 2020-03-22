package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductAttributeCategoryController{
    @Autowired
private ProductAttributeCategoryService service;
@ApiOperation("updateProductAttributeCategory)
@PostMapping("/update/ProductAttributeCategory/")
public  void  update(ProductAttributeCategoryDto  dto){
service.ProductAttributeCategory (dto) 
}
}
