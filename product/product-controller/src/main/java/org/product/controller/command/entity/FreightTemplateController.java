package  org.product.controller.command.entity;

import org.product.dto.entity.FreightTemplateDto;
import org.product.service.command.entity.FreightTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class FreightTemplateController{
    @Autowired
private FreightTemplateService service;
@PostMapping(value=" freighttemplate")
public  void  update(FreightTemplateDto dto){
service.FreightTemplate (dto); 
}
}
