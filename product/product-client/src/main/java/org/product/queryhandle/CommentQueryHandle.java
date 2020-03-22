package  org.product.queryhandle;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
public class CommentQueryHandle{
    @QueryHandler
public List<Comment>query(CommentQuery query){


}}
