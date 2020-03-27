package  org.activite.service.query.entity;

import org.activite.domain.entity.RecommendProduct;
import org.activite.executor.query.entity.RecommendProductQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class RecommendProductQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<RecommendProduct>  query(RecommendProductQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(RecommendProduct.class)).join();
}
}
