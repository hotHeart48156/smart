package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.Address;
import org.product.executor.query.entity.AddressQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class AddressQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<Address>  query(AddressQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(Address.class)).join();
}
}
