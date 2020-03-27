package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductAttribute;
import org.product.executor.query.entity.ProductAttributeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductAttributeQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductAttribute>  query(ProductAttributeQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductAttribute.class)).join();
}
}
