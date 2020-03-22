package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.aggregation.Aggregation;
import org.users.executor.query.aggre.AggregationQuery;

import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class AggregationQueryService{
@Autowired
private QueryGateway queryGateway;
public List<Aggregation>  query(AggregationQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Aggregation.class)).join();
}
}
