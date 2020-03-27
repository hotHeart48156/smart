package  org.activite.service.query.entity;

import org.activite.domain.entity.RecommendSubject;
import org.activite.executor.query.entity.RecommendSubjectQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class RecommendSubjectQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<RecommendSubject>  query(RecommendSubjectQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(RecommendSubject.class)).join();
}
}
