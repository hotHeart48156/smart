package org.users.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.users.domain.entity.Address;
import org.users.executor.query.entity.AddressQuery;

import java.util.List;
import org.springframework.stereotype.Service;
import org.users.service.AbstractQueryService;

@Service
public class AddressQueryService  extends AbstractQueryService {
@Autowired
private QueryGateway queryGateway;
public List<Address>  query(AddressQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Address.class)).join();
}
}
