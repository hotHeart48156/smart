package  org.product.controller.query.entity;

import org.product.dto.entity.FreightTemplateDto;
import org.product.service.command.entity.FreightTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class FreightTemplateController{
    @Autowired
private FreightTemplateService service;
@PostMapping(value="FreightTemplate") 
public  void  query(FreightTemplateDto  dto){
service.FreightTemplate (dto); 
}
}