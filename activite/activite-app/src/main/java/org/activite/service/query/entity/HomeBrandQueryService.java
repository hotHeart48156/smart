package  org.activite.service.query.entity;

import org.activite.domain.entity.HomeBrand;
import org.activite.executor.query.entity.HomeBrandQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class HomeBrandQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<HomeBrand>  query(HomeBrandQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(HomeBrand.class)).join();
}
}
