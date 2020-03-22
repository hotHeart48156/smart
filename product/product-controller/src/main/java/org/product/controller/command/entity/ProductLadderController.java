package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductLadderController{
    @Autowired
private ProductLadderService service;
@ApiOperation("updateProductLadder)
@PostMapping("/update/ProductLadder/")
public  void  update(ProductLadderDto  dto){
service.ProductLadder (dto) 
}
}
