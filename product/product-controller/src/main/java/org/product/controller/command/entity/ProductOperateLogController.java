package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductOperateLogController{
    @Autowired
private ProductOperateLogService service;
@ApiOperation("updateProductOperateLog)
@PostMapping("/update/ProductOperateLog/")
public  void  update(ProductOperateLogDto  dto){
service.ProductOperateLog (dto) 
}
}
