package org.users.service.query;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.UserAndAddressRelationship;
import org.users.executor.query.entity.UserAndAddressRelationshipQuery;

import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class UserAndAddressRelationshipQueryService{
@Autowired
private QueryGateway queryGateway;
public List<UserAndAddressRelationship>  query(UserAndAddressRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserAndAddressRelationship.class)).join();
}
}
