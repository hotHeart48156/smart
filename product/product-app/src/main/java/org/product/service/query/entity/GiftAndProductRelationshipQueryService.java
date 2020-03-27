package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.GiftAndProductRelationship;
import org.product.executor.query.entity.GiftAndProductRelationshipQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class GiftAndProductRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<GiftAndProductRelationship>  query(GiftAndProductRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(GiftAndProductRelationship.class)).join();
}
}
