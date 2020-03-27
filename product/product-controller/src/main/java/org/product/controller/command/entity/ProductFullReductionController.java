package  org.product.controller.command.entity;

import org.product.dto.entity.ProductFullReductionDto;
import org.product.service.command.entity.ProductFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class ProductFullReductionController{
    @Autowired
private ProductFullReductionService service;
@PostMapping(value=" entityFile ")
public  void  update(ProductFullReductionDto  dto){
service.ProductFullReduction (dto); 
}
}
