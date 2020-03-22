package  org.product.queryservice;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class CommentQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Comment>  query(CommentQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Comment.class)).join();
}
}
