package  org.activite.controller.command.coupon;

import org.activite.dto.agg.coupon.ProductAttributesDto;
import org.activite.service.command.coupon.ProductAttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/update")
public class ProductAttributesController{
    @Autowired
private ProductAttributesService service;
@PostMapping(value=" entityFile ")
public  void  update(ProductAttributesDto dto){
service.ProductAttributes (dto); 
}
}
