package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentAndProductRelationshipController{
    @Autowired
private CommentAndProductRelationshipService service;
@ApiOperation("updateCommentAndProductRelationship)
@PostMapping("/update/CommentAndProductRelationship/")
public  void  update(CommentAndProductRelationshipDto  dto){
service.CommentAndProductRelationship (dto) 
}
}
