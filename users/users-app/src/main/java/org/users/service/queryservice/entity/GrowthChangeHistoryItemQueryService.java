package org.users.service.queryservice;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.GrowthChangeHistoryItem;
import org.users.executor.query.GrowthChangeHistoryItemQuery;

import java.util.List;

public class GrowthChangeHistoryItemQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<GrowthChangeHistoryItem>  query(GrowthChangeHistoryItemQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(GrowthChangeHistoryItem.class)).join();
}
}
