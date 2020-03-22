package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductCategoryController{
    @Autowired
private ProductCategoryService service;
@ApiOperation("updateProductCategory)
@PostMapping("/update/ProductCategory/")
public  void  update(ProductCategoryDto  dto){
service.ProductCategory (dto) 
}
}
