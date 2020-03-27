package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductSkuStock;
import org.product.executor.query.entity.ProductSkuStockQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductSkuStockQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductSkuStock>  query(ProductSkuStockQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductSkuStock.class)).join();
}
}
