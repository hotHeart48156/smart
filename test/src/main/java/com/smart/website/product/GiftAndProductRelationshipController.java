package com.smart.website.product;

import org.product.dto.entity.GiftAndProductRelationshipDto;
import org.product.service.command.entity.GiftAndProductRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GiftAndProductRelationshipController{
    @Autowired
private GiftAndProductRelationshipService service;
@PostMapping(value="/query/giftAndProductRelationship")
public  void  query(GiftAndProductRelationshipDto dto){
service.GiftAndProductRelationship (dto); 
}
}
