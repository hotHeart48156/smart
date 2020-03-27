package  org.product.controller.query.entity;

import org.product.dto.entity.ProductCategoryDto;
import org.product.service.command.entity.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductCategoryController{
    @Autowired
private ProductCategoryService service;
@PostMapping(value="ProductCategory") 
public  void  query(ProductCategoryDto  dto){
service.ProductCategory (dto); 
}
}
