package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductCategory;
import org.product.executor.query.entity.ProductCategoryQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductCategoryQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductCategory>  query(ProductCategoryQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductCategory.class)).join();
}
}
