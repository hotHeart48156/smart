package  org.product.controller.command.entity;

import org.product.dto.entity.ProductAttributeDto;
import org.product.service.command.entity.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductAttributeController{
    @Autowired
private ProductAttributeService service;
@PostMapping(value=" /update/productAttribute")
public  void  update(ProductAttributeDto  dto){
service.ProductAttribute (dto); 
}
}
