package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductAndCategoryRelationship;
import org.product.executor.query.entity.ProductAndCategoryRelationshipQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductAndCategoryRelationshipQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductAndCategoryRelationship>  query(ProductAndCategoryRelationshipQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductAndCategoryRelationship.class)).join();
}
}
