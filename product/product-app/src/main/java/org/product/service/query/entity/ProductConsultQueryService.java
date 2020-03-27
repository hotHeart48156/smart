package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductConsult;
import org.product.executor.query.entity.ProductConsultQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductConsultQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductConsult>  query(ProductConsultQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductConsult.class)).join();
}
}
