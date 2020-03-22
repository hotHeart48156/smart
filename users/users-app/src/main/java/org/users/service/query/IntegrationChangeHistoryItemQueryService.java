package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.IntegrationChangeHistoryItem;
import org.users.executor.query.entity.IntegrationChangeHistoryItemQuery;

import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class IntegrationChangeHistoryItemQueryService{
@Autowired
private QueryGateway queryGateway;
public List<IntegrationChangeHistoryItem>  query(IntegrationChangeHistoryItemQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(IntegrationChangeHistoryItem.class)).join();
}
}
