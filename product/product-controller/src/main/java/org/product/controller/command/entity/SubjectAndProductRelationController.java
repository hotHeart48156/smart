package  org.product.controller.command.entity;

import org.product.dto.entity.SubjectAndProductRelationDto;
import org.product.service.command.entity.SubjectAndProductRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SubjectAndProductRelationController{
    @Autowired
private SubjectAndProductRelationService service;
@PostMapping(value=" /update/SubjectAndProduct")
public  void  update(SubjectAndProductRelationDto  dto){
service.subjectAndProductRelation (dto);
}
}
