package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.users.domain.entity.UserAndRoleRelationship;
import org.users.executor.query.entity.UserAndRoleRelationshipQuery;

import java.util.List;
@Service
public class UserAndRoleRelationshipQueryService{
@Autowired
private QueryGateway queryGateway;
public List<UserAndRoleRelationship>  query(UserAndRoleRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserAndRoleRelationship.class)).join();
}
}
