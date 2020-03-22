package org.users.service.queryservice;
import java.util.List;
import org.activite.domain.entity.AbstractEntity;
import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
public class UserAndAddressRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<UserAndAddressRelationship>  query(UserAndAddressRelationshipQuery  query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(UserAndAddressRelationship.class)).join();
}
}
