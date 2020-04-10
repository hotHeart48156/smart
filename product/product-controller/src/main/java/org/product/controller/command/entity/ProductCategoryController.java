package  org.product.controller.command.entity;

import org.product.dto.entity.ProductCategoryDto;
import org.product.service.command.entity.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductCategoryController{
    @Autowired
private ProductCategoryService service;
@PostMapping(value=" productCategory")
public  void  update(ProductCategoryDto  dto){
service.ProductCategory (dto); 
}
}
