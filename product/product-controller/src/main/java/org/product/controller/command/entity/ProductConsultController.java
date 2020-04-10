package  org.product.controller.command.entity;

import org.product.dto.entity.ProductConsultDto;
import org.product.service.command.entity.ProductConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductConsultController{
    @Autowired
private ProductConsultService service;
@PostMapping(value=" productConsult")
public  void  update(ProductConsultDto  dto){
service.ProductConsult (dto); 
}
}
