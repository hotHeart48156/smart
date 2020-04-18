package  org.product.controller.command.entity;

import org.product.dto.entity.ProductOperateLogDto;
import org.product.service.command.entity.ProductOperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductOperateLogController{
    @Autowired
private ProductOperateLogService service;
@PostMapping(value=" /update/productOperateLog")
public  void  update(ProductOperateLogDto  dto){
service.productOperateLog (dto);
}
}
