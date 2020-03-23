package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.aggregation.Aggregation;

import java.util.List;
import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class AggregationQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<Aggregation>  query(AggregationQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Aggregation.class)).join();
}
}
