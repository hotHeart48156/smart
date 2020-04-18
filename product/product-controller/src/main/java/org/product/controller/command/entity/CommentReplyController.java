package  org.product.controller.command.entity;

import org.product.dto.entity.CommentReplyDto;
import org.product.service.command.entity.CommentReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommentReplyController{
    @Autowired
private CommentReplyService service;
@PostMapping(value="/update/commentreply")
public  void  update(CommentReplyDto dto){
service.commentReply (dto);
}
}
