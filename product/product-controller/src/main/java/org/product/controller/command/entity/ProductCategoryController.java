package  org.product.controller.command.entity;

import org.product.dto.entity.ProductCategoryDto;
import org.product.service.command.entity.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductCategoryController{
    @Autowired
private ProductCategoryService service;
@PostMapping(value=" /update/productCategory")
public  void  update(ProductCategoryDto  dto){
service.productCategory (dto);
}
}
