package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductFullReductionController{
    @Autowired
private ProductFullReductionService service;
@ApiOperation("updateProductFullReduction)
@PostMapping("/update/ProductFullReduction/")
public  void  update(ProductFullReductionDto  dto){
service.ProductFullReduction (dto) 
}
}
