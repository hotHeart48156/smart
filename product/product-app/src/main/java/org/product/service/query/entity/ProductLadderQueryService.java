package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductLadder;
import org.product.executor.query.entity.ProductLadderQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductLadderQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductLadder>  query(ProductLadderQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductLadder.class)).join();
}
}
