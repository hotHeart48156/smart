package com.smart.website.product;

import org.product.dto.entity.FreightTemplateDto;
import org.product.service.command.entity.FreightTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FreightTemplateController{
    @Autowired
private FreightTemplateService service;
@PostMapping(value="/query/freightTemplate")
public  void  query(FreightTemplateDto  dto){
service.FreightTemplate (dto); 
}
}
