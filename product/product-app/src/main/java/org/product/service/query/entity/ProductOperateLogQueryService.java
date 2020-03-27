package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductOperateLog;
import org.product.executor.query.entity.ProductOperateLogQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductOperateLogQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductOperateLog>  query(ProductOperateLogQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductOperateLog.class)).join();
}
}
