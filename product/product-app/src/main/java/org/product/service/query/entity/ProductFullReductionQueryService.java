package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductFullReduction;
import org.product.executor.query.entity.ProductFullReductionQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductFullReductionQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductFullReduction>  query(ProductFullReductionQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductFullReduction.class)).join();
}
}
