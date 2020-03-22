package  org.product.queryservice;
import org.axonframework.queryhandling.QueryHandler;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class SubjectAndProductRelationQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<SubjectAndProductRelation>  query(SubjectAndProductRelationQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(SubjectAndProductRelation.class)).join();
}
}