package  org.product.controller.command.entity;

import org.product.dto.entity.ProductOperateLogDto;
import org.product.service.command.entity.ProductOperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductOperateLogController{
    @Autowired
private ProductOperateLogService service;
@PostMapping(value=" entityFile ")
public  void  update(ProductOperateLogDto  dto){
service.ProductOperateLog (dto); 
}
}
