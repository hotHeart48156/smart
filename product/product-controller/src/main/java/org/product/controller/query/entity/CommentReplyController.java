package org.product.controller.query.entity;
import org.product.dto.entity.CommentReplyDto;
import org.product.service.command.entity.CommentReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class CommentReplyController{
    @Autowired
private CommentReplyService service;
@PostMapping(value="CommentReply") 
public  void  query(CommentReplyDto  dto){
service.CommentReply (dto); 
}
}
