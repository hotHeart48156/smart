package  org.product.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class CommentReplyQueryHandle{
    @QueryHandler
public List<CommentReply>query(CommentReplyQuery query){


}}
