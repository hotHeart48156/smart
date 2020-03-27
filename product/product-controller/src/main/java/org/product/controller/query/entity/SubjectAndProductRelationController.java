package  org.product.controller.query.entity;

import org.product.dto.entity.SubjectAndProductRelationDto;
import org.product.service.command.entity.SubjectAndProductRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class SubjectAndProductRelationController{
    @Autowired
private SubjectAndProductRelationService service;
@PostMapping(value="SubjectAndProductRelation") 
public  void  query(SubjectAndProductRelationDto  dto){
service.SubjectAndProductRelation (dto); 
}
}
