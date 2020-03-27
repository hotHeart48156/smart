package  org.product.controller.query.entity;

import org.product.dto.entity.ProductLadderDto;
import org.product.service.command.entity.ProductLadderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class ProductLadderController{
    @Autowired
private ProductLadderService service;
@PostMapping(value="ProductLadder") 
public  void  query(ProductLadderDto dto){
service.ProductLadder (dto); 
}
}
