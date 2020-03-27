package  org.product.controller.query.entity;

import org.product.dto.entity.GiftAndProductRelationshipDto;
import org.product.service.command.entity.GiftAndProductRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class GiftAndProductRelationshipController{
    @Autowired
private GiftAndProductRelationshipService service;
@PostMapping(value="GiftAndProductRelationship") 
public  void  query(GiftAndProductRelationshipDto dto){
service.GiftAndProductRelationship (dto); 
}
}
