package  org.activite.service.query.entity;

import org.activite.domain.entity.HomeAdvertise;
import org.activite.executor.query.entity.HomeAdvertiseQuery;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public class HomeAdvertiseQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<HomeAdvertise>  query(HomeAdvertiseQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(HomeAdvertise.class)).join();
}
}
