package  org.product.controller.query.entity;

import org.product.dto.entity.ProductOperateLogDto;
import org.product.service.command.entity.ProductOperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductOperateLogController{
    @Autowired
private ProductOperateLogService service;
@PostMapping(value="ProductOperateLog") 
public  void  query(ProductOperateLogDto  dto){
service.ProductOperateLog (dto); 
}
}
