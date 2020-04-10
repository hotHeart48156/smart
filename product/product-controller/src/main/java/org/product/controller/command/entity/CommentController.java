package  org.product.controller.command.entity;

import org.product.dto.entity.CommentDto;
import org.product.service.command.entity.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController(value="/update")
public class CommentController{
    @Autowired
private CommentService service;
@PostMapping(value=" comment")
public  void  update(CommentDto  dto){
service.Comment (dto); 
}
}
