package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.SubjectAndProductRelation;
import org.product.executor.query.entity.SubjectAndProductRelationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class SubjectAndProductRelationQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<SubjectAndProductRelation>  query(SubjectAndProductRelationQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(SubjectAndProductRelation.class)).join();
}
}
