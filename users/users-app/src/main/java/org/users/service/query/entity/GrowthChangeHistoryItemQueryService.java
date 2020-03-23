package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.domain.entity.GrowthChangeHistoryItem;
import org.users.executor.query.entity.GrowthChangeHistoryItemQuery;
import org.users.service.AbstractQueryService;

import java.util.List;
@Service
public class GrowthChangeHistoryItemQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<GrowthChangeHistoryItem>  query(GrowthChangeHistoryItemQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(GrowthChangeHistoryItem.class)).join();
}
}
