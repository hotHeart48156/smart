package org.product.service.query.entity;

import org.axonframework.messaging.responsetypes.ResponseTypes;
import org.axonframework.queryhandling.QueryGateway;
import org.product.domain.entity.ProductVerifyRecord;
import org.product.executor.query.entity.ProductVerifyRecordQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class ProductVerifyRecordQueryService{
    @Autowired
private QueryGateway queryGateway;
public List<ProductVerifyRecord>  query(ProductVerifyRecordQuery query){
   return queryGateway.query(query, ResponseTypes.multipleInstancesOf(ProductVerifyRecord.class)).join();
}
}
