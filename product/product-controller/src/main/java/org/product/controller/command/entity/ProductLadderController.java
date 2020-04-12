package  org.product.controller.command.entity;

import org.product.dto.entity.ProductLadderDto;
import org.product.service.command.entity.ProductLadderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductLadderController{
    @Autowired
private ProductLadderService service;
@PostMapping(value=" /update/productLadder")
public  void  update(ProductLadderDto  dto){
service.ProductLadder (dto); 
}
}
