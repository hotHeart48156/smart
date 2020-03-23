package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.IntegrationChangeHistoryItem;
import org.users.executor.query.entity.IntegrationChangeHistoryItemQuery;

import java.util.List;
import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class IntegrationChangeHistoryItemQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<IntegrationChangeHistoryItem>  query(IntegrationChangeHistoryItemQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(IntegrationChangeHistoryItem.class)).join();
}
}
