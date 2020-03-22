package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.UserAndGrowChangeHistoryRelationship;
import org.users.executor.query.entity.UserAndGrowChangeHistoryRelationshipQuery;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserAndGrowChangeHistoryRelationshipQueryService{
@Autowired
private QueryGateway queryGateway;
public List<UserAndGrowChangeHistoryRelationship>  query(UserAndGrowChangeHistoryRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserAndGrowChangeHistoryRelationship.class)).join();
}
}
