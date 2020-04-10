package  org.product.controller.command.entity;

import org.product.dto.entity.ProductAttributeCategoryDto;
import org.product.service.command.entity.ProductAttributeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductAttributeCategoryController{
    @Autowired
private ProductAttributeCategoryService service;
@PostMapping(value=" productAttributeCategory")
public  void  update(ProductAttributeCategoryDto  dto){
service.ProductAttributeCategory (dto); 
}
}
