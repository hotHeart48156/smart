package org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;

public class CommentReplyController{
    @Autowired
private CommentReplyService service;
@ApiOperation("updateCommentReply)
@PostMapping("/update/CommentReply/")
public  void  update(CommentReplyDto  dto){
service.CommentReply (dto) 
}
}
