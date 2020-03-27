package  org.product.controller.query.entity;

import org.product.dto.entity.CommentDto;
import org.product.service.command.entity.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/query/")
public class CommentController{
    @Autowired
private CommentService service;
@PostMapping(value="Comment") 
public  void  query(CommentDto  dto){
service.Comment (dto); 
}
}
