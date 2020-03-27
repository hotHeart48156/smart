package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.CommentAndProductRelationship;
import org.product.executor.query.entity.CommentAndProductRelationshipQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class CommentAndProductRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<CommentAndProductRelationship>  query(CommentAndProductRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(CommentAndProductRelationship.class)).join();
}
}
