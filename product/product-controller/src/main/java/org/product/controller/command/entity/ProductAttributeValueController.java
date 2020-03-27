package  org.product.controller.command.entity;

import org.product.dto.entity.ProductAttributeValueDto;
import org.product.service.command.entity.ProductAttributeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductAttributeValueController{
    @Autowired
private ProductAttributeValueService service;
@PostMapping(value=" entityFile ")
public  void  update(ProductAttributeValueDto  dto){
service.ProductAttributeValue (dto); 
}
}
