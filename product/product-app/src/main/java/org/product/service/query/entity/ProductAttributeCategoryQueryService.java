package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductAttributeCategory;
import org.product.executor.query.entity.ProductAttributeCategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductAttributeCategoryQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductAttributeCategory>  query(ProductAttributeCategoryQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductAttributeCategory.class)).join();
}
}
