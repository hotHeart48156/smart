package  org.product.controller.command.entity;

import org.product.dto.entity.ProductFullReductionDto;
import org.product.service.command.entity.ProductFullReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductFullReductionController{
    @Autowired
private ProductFullReductionService service;
@PostMapping(value=" /update/productFullReduction")
public  void  update(ProductFullReductionDto  dto){
service.ProductFullReduction (dto); 
}
}
