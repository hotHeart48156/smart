package  org.product.commandservice;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.activite.executor.command.AbstractCommand;
public class CommentReplyService{
@Autowired
private CommandGateway commandGateway;
public void CommentReply(CommentReplyDto dto){
AbstractCommand command=new CommentReplyCommand(dto);
commandGateway.sendAndWait(command);
}
}