package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class SubjectAndProductRelationController{
    @Autowired
private SubjectAndProductRelationService service;
@ApiOperation("updateSubjectAndProductRelation)
@PostMapping("/update/SubjectAndProductRelation/")
public  void  update(SubjectAndProductRelationDto  dto){
service.SubjectAndProductRelation (dto) 
}
}
