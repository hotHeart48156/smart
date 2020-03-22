package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.UserAndUserCollectRelationship;
import org.users.executor.query.entity.UserAndUserCollectRelationshipQuery;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UserAndUserCollectRelationshipQueryService{
@Autowired
private QueryGateway queryGateway;
public List<UserAndUserCollectRelationship>  query(UserAndUserCollectRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserAndUserCollectRelationship.class)).join();
}
}
