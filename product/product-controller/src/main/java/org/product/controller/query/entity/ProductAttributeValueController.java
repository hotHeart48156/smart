package  org.product.controller.query.entity;

import org.product.dto.entity.ProductAttributeValueDto;
import org.product.service.command.entity.ProductAttributeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductAttributeValueController{
    @Autowired
private ProductAttributeValueService service;
@PostMapping(value="ProductAttributeValue") 
public  void  query(ProductAttributeValueDto dto){
service.ProductAttributeValue (dto); 
}
}