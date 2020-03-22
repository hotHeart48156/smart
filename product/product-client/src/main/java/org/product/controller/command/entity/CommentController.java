package  org.product.controller.command.entity;
import org.activite.executor.AbstractCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
public class CommentController{
    @Autowired
private CommentService service;
@ApiOperation("updateComment)
@PostMapping("/update/Comment/")
public  void  update(CommentDto  dto){
service.Comment (dto) 
}
}
